package co.decem.model.dto;

import co.decem.model.Cart;
import co.decem.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {

    private Long id;
    private Cart cart;
    private Product product;
    private Long quantity;
    private Long price;
    
}
