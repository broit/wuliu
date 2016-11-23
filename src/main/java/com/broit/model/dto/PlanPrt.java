package com.broit.model.dto;

import java.util.List;

import com.broit.model.ServProduct;
import com.broit.model.ServPrtFormula;

public class PlanPrt {
	
	private String type;
	
	private String refid;
	
	private String refno;
	
	private Long productNum;
	
	/**订单产品数量*/
	private Long ordernum;
	
	/**冗余产品数量*/
	private Long spilthnum;
	
	/**调拨数量*/
	private Long allocatenum;
	
	private Long finishNum;
	
	private String formulaid;
	
	/**产品信息*/
	private ServProduct prt;
	
	/**生产线*/
	private List<PrdLineDto> lineList;
	
	/**配方*/
	private List<ServPrtFormula> formulaList;
	
	private String remark;

	public Long getProductNum() {
		return productNum;
	}

	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}

	public Long getFinishNum() {
		return finishNum;
	}

	public void setFinishNum(Long finishNum) {
		this.finishNum = finishNum;
	}

	public ServProduct getPrt() {
		return prt;
	}

	public void setPrt(ServProduct prt) {
		this.prt = prt;
	}

	public List<PrdLineDto> getLineList() {
		return lineList;
	}

	public void setLineList(List<PrdLineDto> lineList) {
		this.lineList = lineList;
	}

	public List<ServPrtFormula> getFormulaList() {
		return formulaList;
	}

	public void setFormulaList(List<ServPrtFormula> formulaList) {
		this.formulaList = formulaList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRefid() {
		return refid;
	}

	public void setRefid(String refid) {
		this.refid = refid;
	}

	public String getFormulaid() {
		return formulaid;
	}

	public void setFormulaid(String formulaid) {
		this.formulaid = formulaid;
	}

	public Long getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Long ordernum) {
		this.ordernum = ordernum;
	}

	public Long getSpilthnum() {
		return spilthnum;
	}

	public void setSpilthnum(Long spilthnum) {
		this.spilthnum = spilthnum;
	}

	public Long getAllocatenum() {
		return allocatenum;
	}

	public void setAllocatenum(Long allocatenum) {
		this.allocatenum = allocatenum;
	}

	public String getRefno() {
		return refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
