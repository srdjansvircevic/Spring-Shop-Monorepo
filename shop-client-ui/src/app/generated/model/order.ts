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
import { OrderLine } from './orderLine';
import { PaymentMethod } from './paymentMethod';

export interface Order { 
    id?: number;
    salesDate?: number;
    totalAmmount?: number;
    paymentMethod?: PaymentMethod;
    orderLines?: Array<OrderLine>;
}