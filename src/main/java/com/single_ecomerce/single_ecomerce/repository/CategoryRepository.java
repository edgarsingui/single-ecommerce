package com.single_ecomerce.single_ecomerce.repository;

import com.single_ecomerce.single_ecomerce.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
