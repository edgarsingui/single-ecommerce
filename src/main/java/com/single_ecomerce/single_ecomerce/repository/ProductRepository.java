package com.single_ecomerce.single_ecomerce.repository;
import com.single_ecomerce.single_ecomerce.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Long> {
    List<Product> findTop5ByFeatured(Boolean featured);
    Product findBySlug(String slug);
}
