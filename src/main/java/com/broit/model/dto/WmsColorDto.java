package com.broit.model.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.broit.model.WmsColor;

	public class WmsColorDto extends WmsColor{
//		private static final long serialVersionUID = 1L;

	    private String ColorId;

	    private String isdefault;
	    
	    private String batchName;
	    
	    private String nameMark;
	    
	    private BigDecimal entrynum;
	    
	    private BigDecimal deliverynum;
	    
	    private BigDecimal serial;
	    
	    private String batchId;
	    
	    private Date entrydate;
	    
	    private Date deliverydate;
	    
	    private String colorName;
	    
	    private String warning;

	    public String getWarning() {
			return warning;
		}

		public void setWarning(String warning) {
			this.warning = warning;
		}

		public String getColorName() {
			return colorName;
		}

		public void setColorName(String colorName) {
			this.colorName = colorName;
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

		public String getNameMark() {
			return nameMark;
		}

		public void setNameMark(String nameMark) {
			this.nameMark = nameMark;
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

		public String getBatch() {
			return batchName;
		}

		public void setBatch(String batchName) {
			this.batchName = batchName;
		}
		
		public String getColorId() {
			return ColorId;
		}

		public void setColorId(String colorId) {
			ColorId = colorId;
		}

		public String getBatchName() {
			return batchName;
		}

		public void setBatchName(String batchName) {
			this.batchName = batchName;
		}

		public String getIsdefault() {
			return isdefault;
		}

		public void setIsdefault(String isdefault) {
			this.isdefault = isdefault;
		}
}