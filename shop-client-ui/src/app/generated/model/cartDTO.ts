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
import { CartItemDTO } from './cartItemDTO';

export interface CartDTO { 
    id?: number;
    totalAmmount?: number;
    dateCreated?: Date;
    cartItem?: Array<CartItemDTO>;
}