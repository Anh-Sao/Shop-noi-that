	package com.noithat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "count")
	private int count;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "thumbnail")
	private String thumbnail;
		
	@Column(name = "content")
	private String content;
	
	@ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
	
	@ManyToOne
    @JoinColumn(name = "supplier_id")
    private SupplierEntity supplier;
	
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

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public SupplierEntity getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierEntity supplier) {
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
