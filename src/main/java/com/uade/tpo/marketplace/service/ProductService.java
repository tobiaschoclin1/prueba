package com.uade.tpo.marketplace.service;

import com.uade.tpo.marketplace.entity.Product;
import com.uade.tpo.marketplace.entity.Category;
import com.uade.tpo.marketplace.entity.dto.ProductResponse;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> getAllProducts();

    public List<Product> getAvailableProducts();

    public List<Product> getProductsByCategory(Long categoryId);

    public List<ProductResponse> getProductsByPriceRange(BigDecimal min, BigDecimal max);

    public List<Product> getProductsByPriceLess(BigDecimal min);

    public Product createProduct(String description, BigDecimal price, Integer stock, Category category);
    
    public Optional<Product> getProductById(Long id);

    public void deleteProductById(Long id);

    public Product save(Product product);
}
