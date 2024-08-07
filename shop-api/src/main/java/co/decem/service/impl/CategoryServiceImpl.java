package co.decem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import co.decem.dao.CategoryRepository;
import co.decem.service.CategoryService;
import co.decem.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService{

     @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(@PathVariable Long id) {

        return categoryRepository.findById(id).orElse(null);
  
    }      

}

