package com.rods.ecommerceproject.service;


import com.rods.ecommerceproject.model.Product;
import com.rods.ecommerceproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAll() {
        return repository.findAll();
    }


    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product saveOrUpdateProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getName());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        repository.save(product);

        return product;

    }

    public void deleteProduct(Product product) {
        repository.delete(product);

    }


    public List<Product> searchProducts(String keyword) {

        // Implementing and customizing it using JPQL
        return repository.getProductByKeyWords(keyword);
    }
}
