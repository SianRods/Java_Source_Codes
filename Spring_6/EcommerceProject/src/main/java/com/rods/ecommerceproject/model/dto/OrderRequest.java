package com.rods.ecommerceproject.model.dto;

import java.util.List;

public record OrderRequest(

        /*
        Basically any customer from the client side can use their email and name
        to place the order with list of Order items

        here we the list will contains several requested items from the client side
        for a given order

         */


        String customerName,
        String email,

        // here the name of the list must be kept as items ==> as we are receiving the same item from the forntend
        List<OrderItemRequest> items

) {
}
