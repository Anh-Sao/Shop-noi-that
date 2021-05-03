package com.shopnoithat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopnoithat.entity.Category;
import com.shopnoithat.repository.CategoryRepository;
@Service
public class CategoryServiceImpl implements CateoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
