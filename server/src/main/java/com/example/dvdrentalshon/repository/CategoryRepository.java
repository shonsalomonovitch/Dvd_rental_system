package com.example.dvdrentalshon.repository;

import com.example.dvdrentalshon.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}