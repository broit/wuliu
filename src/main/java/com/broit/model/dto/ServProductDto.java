package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.broit.model.ServProduct;
import com.broit.model.ServPrtFormula;

public class ServProductDto extends ServProduct{
	
	private Long stock;
	
	private String prtid;
	
	private String type;
	
	private List<ServPrtFormula> formulaList;
	
	private List<ServProduct> partList;
	
	private String productName;
	
	private Date plansdate;
	
	private Date planedate;
	
	private String servProduct;
	
	private BigDecimal producenum;
	
	private String servProductId;

	public Date getPlanedate() {
		return planedate;
	}

	public void setPlanedate(Date planedate) {
		this.planedate = planedate;
	}

	public String getServProductId() {
		return servProductId;
	}

	public void setServProductId(String servProductId) {
		this.servProductId = servProductId;
	}

	public BigDecimal getProducenum() {
		return producenum;
	}

	public void setProducenum(BigDecimal producenum) {
		this.producenum = producenum;
	}

	public String getServProduct() {
		return servProduct;
	}

	public void setServProduct(String servProduct) {
		this.servProduct = servProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPlansdate() {
		return plansdate;
	}

	public void setPlansdate(Date plansdate) {
		this.plansdate = plansdate;
	}

	public List<ServPrtFormula> getFormulaList() {
		return formulaList;
	}

	public void setFormulaList(List<ServPrtFormula> formulaList) {
		this.formulaList = formulaList;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public String getPrtid() {
		return prtid;
	}

	public void setPrtid(String prtid) {
		this.prtid = prtid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ServProduct> getPartList() {
		return partList;
	}

	public void setPartList(List<ServProduct> partList) {
		this.partList = partList;
	}
}
