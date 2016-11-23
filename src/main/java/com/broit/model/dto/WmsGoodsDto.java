package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.broit.model.WmsGoods;

	public class WmsGoodsDto extends WmsGoods{
		
//		private static final long serialVersionUID = 1L;

	    private String goodsId;
	    
	    private String goodsName;

	    private String isdefault;
	    
	    private String batchType;

		private String nameType;
	    
	    private BigDecimal entrynum;
	    
	    private BigDecimal deliverynum;
	    
	    private BigDecimal serial;
	    
	    private Date entrydate;
	    
	    private Date deliverydate;
	    
	    private String batchId;
	    
	    private String pId;

	    private String code;

	    private String standard;

	    private BigDecimal weight;	    
	    
	    private String pName;
	    
	    private String batchName;
	    
	    private List<WmsGoodsDto> selectNameList;	 
	    
	    private String warning;
	    
	    public String getWarning() {
			return warning;
		}

		public void setWarning(String warning) {
			this.warning = warning;
		}

		public String getGoodsId() {
			return goodsId;
		}

		public void setGoodsId(String goodsId) {
			this.goodsId = goodsId;
		}

		public String getGoodsName() {
			return goodsName;
		}

		public void setGoodsName(String goodsName) {
			this.goodsName = goodsName;
		}

		public String getBatchName() {
			return batchName;
		}

		public Date getEntrydate() {
			return entrydate;
		}

		public void setEntrydate(Date entrydate) {
			this.entrydate = entrydate;
		}

		public Date getDeliverydate() {
			return deliverydate;
		}

		public void setDeliverydate(Date deliverydate) {
			this.deliverydate = deliverydate;
		}

		public void setBatchName(String batchName) {
			this.batchName = batchName;
		}

		public String getpName() {
			return pName;
		}

		public void setpName(String pName) {
			this.pName = pName;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getStandard() {
			return standard;
		}

		public void setStandard(String standard) {
			this.standard = standard;
		}

		public BigDecimal getWeight() {
			return weight;
		}

		public void setWeight(BigDecimal weight) {
			this.weight = weight;
		}
	    
		public String getpId() {
			return pId;
		}

		public void setpId(String pId) {
			this.pId = pId;
		}

		public List<WmsGoodsDto> getSelectNameList() {
			return selectNameList;
		}

		public void setSelectNameList(List<WmsGoodsDto> selectNameList) {
			this.selectNameList = selectNameList;
		}

		public String getBatchId() {
			return batchId;
		}

		public void setBatchId(String batchId) {
			this.batchId = batchId;
		}

		public BigDecimal getSerial() {
			return serial;
		}

		public void setSerial(BigDecimal serial) {
			this.serial = serial;
		}

		public String getNameType() {
			return nameType;
		}

		public void setNameType(String nameType) {
			this.nameType = nameType;
		}

		public BigDecimal getEntrynum() {
			return entrynum;
		}

		public void setEntrynum(BigDecimal entrynum) {
			this.entrynum = entrynum;
		}

		public BigDecimal getDeliverynum() {
			return deliverynum;
		}

		public void setDeliverynum(BigDecimal deliverynum) {
			this.deliverynum = deliverynum;
		}

	    
	    public String getBatchType() {
			return batchType;
		}

		public void setBatchType(String batchType) {
			this.batchType = batchType;
		}
		
		public String getIsdefault() {
			return isdefault;
		}

		public void setIsdefault(String isdefault) {
			this.isdefault = isdefault;
		}
}