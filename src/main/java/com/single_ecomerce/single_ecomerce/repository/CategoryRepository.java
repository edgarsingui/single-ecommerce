package com.single_ecomerce.single_ecomerce.repository;

import com.single_ecomerce.single_ecomerce.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    List<Category> findByslug(String slug);
}
