package com.broit.model.dto;

import java.util.List;

import com.broit.bean.TreeNodeBean;
import com.broit.model.ServCustomer;
import com.broit.model.ServOrder;
import com.broit.model.ServOrderPrt;

public class ServOrderDto extends ServOrder{

	private String prtid;
	
	private List<ServOrderPrt> products;
	
	private List<ServCustomer> customers;
	
	private TreeNodeBean productTree;
	
	private String orderId;
	
	private String orderPrtId;
	
	private String pName;
	
	public String getOrderPrtId() {
		return orderPrtId;
	}

	public void setOrderPrtId(String orderPrtId) {
		this.orderPrtId = orderPrtId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPrtid() {
		return prtid;
	}

	public void setPrtid(String prtid) {
		this.prtid = prtid;
	}

	public List<ServOrderPrt> getProducts() {
		return products;
	}

	public void setProducts(List<ServOrderPrt> products) {
		this.products = products;
	}

	public TreeNodeBean getProductTree() {
		return productTree;
	}

	public void setProductTree(TreeNodeBean productTree) {
		this.productTree = productTree;
	}

	public List<ServCustomer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<ServCustomer> customers) {
		this.customers = customers;
	}
	
}
