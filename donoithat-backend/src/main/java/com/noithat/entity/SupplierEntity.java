package com.noithat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class SupplierEntity extends BaseEntity{


	
	@Column
	private String name;
	
	@Column
	private String logo;
	
	@Column
	private String email;
	
	@Column
	private String address;
	
	@Column
	private String phone;
	
	@OneToMany(mappedBy = "supplier")
	private List<ProductEntity> products = new ArrayList<>();

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
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

	public List<ProductEntity> getNews() {
		return products;
	}

	public void setNews(List<ProductEntity> products) {
		this.products = products;
	}
	
	
}
