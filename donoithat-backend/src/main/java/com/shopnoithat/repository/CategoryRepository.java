package com.shopnoithat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopnoithat.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
