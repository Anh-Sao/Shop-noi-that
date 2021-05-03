package com.shopnoithat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {

	@Column(name = "title")
	private String title;

	@Column(name = "count")
	private int count;

	@Column(name = "price")
	private double price;

	@Lob
	private String thumbnail;

	@Lob
	private String content;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;

//    @OneToMany(mappedBy = "product")
//    private List<OrderDetailEntity> orderDetail = new ArrayList<>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category_id) {
		this.category = category_id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

//	public List<OrderDetailEntity> getOrderDetail() {
//		return orderDetail;
//	}
//
//	public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
//		this.orderDetail = orderDetail;
//	}
//	

}
