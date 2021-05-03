package com.shopnoithat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier extends BaseEntity {

	@Column
	private String name;

	@Column
	private String email;
	@Column
	private String phone;

	@Column
	private String address;

	@Column
	private String logo;

	@OneToMany(mappedBy = "supplier")
	private List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Product> getNews() {
		return products;
	}

	public void setNews(List<Product> products) {
		this.products = products;
	}

}
