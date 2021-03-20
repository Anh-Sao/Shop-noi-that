package com.shopnoithat.controller.Output;

import java.util.ArrayList;
import java.util.List;

import com.shopnoithat.entity.Supplier;



public class SupplierOutput {
	private int page;
	private int totalPage;
	private List<Supplier> results = new ArrayList<Supplier>();
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<Supplier> getResults() {
		return results;
	}
	public void setResults(List<Supplier> results) {
		this.results = results;
	}
	
	
	

}
