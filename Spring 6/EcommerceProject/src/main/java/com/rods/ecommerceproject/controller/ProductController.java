package com.rods.ecommerceproject.controller;


import com.rods.ecommerceproject.model.Product;
import com.rods.ecommerceproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@CrossOrigin // for running the backend and frontend servers on different port numbers and allowing the access
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService service;


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);

    }


    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {

        Product product = service.getProductById(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    /*
    Methods of accepting the image data along with json data from the client side
    1]. Accepting the JSON and image part alag alag
     */

    @PostMapping("/product")
    public ResponseEntity<?> uploadNewProductImage(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        Product savedproduct = null;

        try {
            savedproduct = service.saveOrUpdateProduct(product, imageFile);
            return new ResponseEntity<>(savedproduct, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    // sending the image also to the client along with the product details
    @GetMapping("product/{productID}/image")
    public ResponseEntity<byte[]> getImageByID(@PathVariable int productID) {
        Product product = service.getProductById(productID);

        if (product != null) {
            return new ResponseEntity<>(product.getImageData(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


    // Using the update and delete method for all the products which have been listed on the site
    // Always check the frontend code for what should be the possible return type of the url in react (expected by the client)
    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProductByID(@PathVariable int id, @RequestPart Product product, @RequestPart MultipartFile imageFile) {
        System.out.println("Enter the Update Route ");
        Product savedproduct = null;

        try {
            savedproduct = service.saveOrUpdateProduct(product, imageFile);
            return new ResponseEntity<>("Added", HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }


    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable int id) {
        Product product = service.getProductById(id);
        if (product != null) {
            service.deleteProduct(product);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Implementing the search for every new keystroke in the search bar
    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchByKeywords(@RequestParam("name") String keyword) {
        List<Product> products = service.searchProducts(keyword);
        System.out.println(keyword);
        System.out.println("searching with :" + keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);


    }


}
