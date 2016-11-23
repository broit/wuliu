package com.broit.model.dto;

import java.util.List;

import com.broit.model.PrdPlan;
import com.broit.model.ServPrtFormula;

public class PrdPlanDto extends PrdPlan{
	
	/**产品名称*/
	private String refName;
	
	/**生产线名称*/
	private String lineName;

	/**注塑机ID*/
	private String immid;
	
	/**注塑机名称*/
	private String immName;
	
	private PlanPrt prt;
	
	/**生产数量*/
	private Long producenum;
	
	/**订单产品数量*/
	private Long ordernum;
	
	/**冗余产品数量*/
	private Long spilthnum;
	
	/**调拨数量*/
	private Long allocatenum;
	
	/**配方ID*/
	private String formulaid;
	
	/**产品名称*/
	private String name;
	
	/**产品编号*/
	private String code;
	
	/**关联记录编号*/
	private String refno;
	
	/**生产产品记录ID*/
	private String splitid;
	
	private List<PrdLineDto> lineList;
	
	private List<ServPrtFormula> formulaList;
	
	private String remark;
	
	/**与前一任务的间隔时间*/
	private long intervalTime;

	public String getImmid() {
		return immid;
	}

	public void setImmid(String immid) {
		this.immid = immid;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public PlanPrt getPrt() {
		return prt;
	}

	public void setPrt(PlanPrt prt) {
		this.prt = prt;
	}

	public Long getProducenum() {
		return producenum;
	}

	public void setProducenum(Long producenum) {
		this.producenum = producenum;
	}

	public String getFormulaid() {
		return formulaid;
	}

	public void setFormulaid(String formulaid) {
		this.formulaid = formulaid;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getImmName() {
		return immName;
	}

	public void setImmName(String immName) {
		this.immName = immName;
	}

	public long getIntervalTime() {
		return intervalTime;
	}

	public void setIntervalTime(long intervalTime) {
		this.intervalTime = intervalTime;
	}

	public String getSplitid() {
		return splitid;
	}

	public void setSplitid(String splitid) {
		this.splitid = splitid;
	}

	public String getRefno() {
		return refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
