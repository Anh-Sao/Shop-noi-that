package com.shopnoithat.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private double totalMoney;
	
	@Column
	private Date date;
	
	@Column
	private String status;
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
	
//	@OneToMany(mappedBy = "orderesult")
//	private List<OrderDetailEntity> orderDetail = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

//	public List<OrderDetailEntity> getOrderDetail() {
//		return orderDetail;
//	}
//
//	public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
//		this.orderDetail = orderDetail;
//	}

	
}
