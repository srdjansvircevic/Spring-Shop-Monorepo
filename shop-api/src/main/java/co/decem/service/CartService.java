package co.decem.service;


import java.util.List;

import co.decem.model.Cart;
import co.decem.model.dto.CartDTO;



public interface CartService {

    List<Cart> getCartWithinTimeInterval();

    Cart addToCart(CartDTO cartDTO);
    
}
