package com.single_ecomerce.single_ecomerce.repository;
import com.single_ecomerce.single_ecomerce.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
