package com.shopnoithat.controller.Output;

import java.util.ArrayList;
import java.util.List;

import com.shopnoithat.entity.Customer;

public class CustomerOutput {
	private int page;
	private int totalPage;
	private List<Customer> results = new ArrayList<Customer>();
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
	public List<Customer> getResults() {
		return results;
	}
	public void setResults(List<Customer> results) {
		this.results = results;
	}
	
	
	

}
