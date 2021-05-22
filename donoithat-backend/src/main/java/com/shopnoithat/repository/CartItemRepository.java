package com.shopnoithat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopnoithat.entity.CartItem;
import com.shopnoithat.entity.Customer;
import com.shopnoithat.entity.OrderDetail;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

	List<CartItem> findByCustomer(Customer customer);

}
