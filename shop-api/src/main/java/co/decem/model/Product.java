package co.decem.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private String description;
    private String name;
    private Long price;
    private String image;
    @OneToOne(fetch = FetchType.EAGER)
    private RelatedProduct relatedProducts;

    @Override
    public String toString() {
        return "Product id: " + id +"; Quantity: " + quantity + "; Description: " + description + "; Name: " + name + "; Price: " + price + "; \n";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public RelatedProduct getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(RelatedProduct relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

}
