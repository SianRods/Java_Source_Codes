package com.rods.ecommerceproject.model.dto;

import java.time.LocalDate;
import java.util.List;

public record OrderResponse(

        /*

        For a given order request from the client containing name , mail and list of items
        we will generate and send back OrderResponse to the client containing the
        ID , name , mail , order status and list of all the order he requested(if valid stock limit permissible )

        The only important thing to be taken care of is that the order item request will only contain the
        product_id and quantity
        we would have to map the product_id to the name and then calculate the total price of the requested
        product in order to submit the response of type OrderResponse to the client

         */


        String orderID,
        String customerName,
        String email,
        String status,
        LocalDate orderDate,
        List<OrderItemResponse> items


) {
}
