/**
 * Your API Title
 * API documentation for your project
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { Cart } from './cart';
import { Product } from './product';

export interface CartItem { 
    id?: number;
    cart?: Cart;
    product?: Product;
    quantity?: number;
    price?: number;
}