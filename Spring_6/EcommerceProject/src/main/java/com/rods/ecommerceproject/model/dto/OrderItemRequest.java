package com.rods.ecommerceproject.model.dto;

public record OrderItemRequest(
        int productID,
        int quantity
) {
}
