package com.shopnoithat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopnoithat.entity.Category;
import com.shopnoithat.entity.Product;

@Repository
public interface FileDBRepository extends JpaRepository<Product,Long>{

	
	 List<Product> findByCategory(Category category);
}
