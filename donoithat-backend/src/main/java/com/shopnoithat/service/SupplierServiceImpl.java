package com.shopnoithat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopnoithat.entity.Supplier;
import com.shopnoithat.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService{
	@Autowired
	SupplierRepository repo;
	
	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

}
