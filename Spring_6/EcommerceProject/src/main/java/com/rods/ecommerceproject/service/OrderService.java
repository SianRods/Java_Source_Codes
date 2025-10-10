package com.rods.ecommerceproject.service;

import com.rods.ecommerceproject.model.Order;
import com.rods.ecommerceproject.model.OrderItem;
import com.rods.ecommerceproject.model.Product;
import com.rods.ecommerceproject.model.dto.OrderItemRequest;
import com.rods.ecommerceproject.model.dto.OrderItemResponse;
import com.rods.ecommerceproject.model.dto.OrderRequest;
import com.rods.ecommerceproject.model.dto.OrderResponse;
import com.rods.ecommerceproject.repository.OrderRepository;
import com.rods.ecommerceproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;
    @Autowired
    ProductRepository productRepository;
    // Using the product repository in order to process the data properly


    public OrderResponse placeOrder(OrderRequest orderRequest) {
        // we will have to create a new instance of order and then add the requested items to the order
        // if adding all the items is possible

        // Creating a new order entity to record in the database for given order request
        Order order = new Order();
        order.setOrderId("ORD" + UUID.randomUUID().toString().substring(0, 8).toUpperCase());
        order.setEmail(orderRequest.email());
        order.setCustomerName(orderRequest.customerName());
        order.setStatus("PLACED");
        order.setOrderDate(LocalDate.now());

        // Now iterating over all the orderitemsrequested in the orderrequest dto
        List<OrderItem> orderItemList = new ArrayList<>();

        System.out.println("Incoming order request: " + orderRequest);

        for (OrderItemRequest itemRequest : orderRequest.items()) {

            System.out.println("Product ID: " + itemRequest.productID());

            // process each individual requested items separately
            Product product = productRepository.findById(itemRequest.productID()).
                    orElseThrow(() -> new RuntimeException("Requested product with given ID not found"));

            // if product has been found update the product tables simul
            product.setStockQuantity(product.getStockQuantity() - itemRequest.quantity());
            productRepository.save(product);

            // Building the OrderItem object and saving it to the list of OrderItemList
            OrderItem orderItem = OrderItem.builder()
                    .product(product)
                    .quantity(itemRequest.quantity())
                    .totalPrice(product.getPrice().multiply(BigDecimal.valueOf(itemRequest.quantity())))
                    .order(order)
                    .build();

            // adding the orderItem to the lists of orderItem for a given order requested by the client
            orderItemList.add(orderItem);
        }

        // setting the given parameter for the class
        order.setOrderItems(orderItemList);
        Order savedOrder = repository.save(order);

        // now building the orderresponse to return the data to the client
        List<OrderItemResponse> orderItemResponseList = new ArrayList<>();
        for (OrderItem item : order.getOrderItems()) {
            OrderItemResponse orderItemResponse = new OrderItemResponse(
                    item.getProduct().getName(),
                    item.getQuantity(),
                    item.getTotalPrice());
            orderItemResponseList.add(orderItemResponse);
        }


        OrderResponse orderResponse = new OrderResponse(
                savedOrder.getOrderId(),
                savedOrder.getCustomerName(),
                savedOrder.getEmail(),
                savedOrder.getStatus(),
                savedOrder.getOrderDate(),
                orderItemResponseList
        );

        return orderResponse;


    }

    public List<OrderResponse> getAllOrders() {
        // returning the list of all the orders in the form of orderResponses to the client side request
        // fetch all the orders
        List<Order> orders = repository.findAll();
        List<OrderResponse> responses = new ArrayList<>();

        // for each and every order in the orders we have to update the
        for (Order order : orders) {

            List<OrderItemResponse> itemResponses = new ArrayList<>();
            for (OrderItem item : order.getOrderItems()) {
                OrderItemResponse orderItemResponse = new OrderItemResponse(
                        item.getProduct().getName(),
                        item.getQuantity(),
                        item.getTotalPrice()
                );
                itemResponses.add(orderItemResponse);
            }

            OrderResponse orderResponse = new OrderResponse(
                    order.getOrderId(),
                    order.getCustomerName(),
                    order.getEmail(),
                    order.getStatus(),
                    order.getOrderDate(),
                    itemResponses
            );
            responses.add(orderResponse);


        }

        return responses;
    }
}
