package com.rods.ecommerceproject.controller;


import com.rods.ecommerceproject.model.dto.OrderRequest;
import com.rods.ecommerceproject.model.dto.OrderResponse;
import com.rods.ecommerceproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class OrderController {

    @Autowired
    OrderService service;


    // placing an order ==> check the frontend mapping url for correctness of the code
    @PostMapping("/orders/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest) {
        System.out.println("Method Entered post method");
        OrderResponse response = service.placeOrder(orderRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // to fetch all the orders from the client side
    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>> getAllOrderResponses() {
        List<OrderResponse> responses = service.getAllOrders();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }


}
