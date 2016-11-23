package com.broit.model.dto;

import java.util.Date;

import com.broit.model.IPrdProduce;
import com.broit.model.PrdPlanGoods;

public class PrdPlanGoodsDto extends PrdPlanGoods implements IPrdProduce{

	private String prtid;
	
	private String goodsName;
	
	private String planGoods;
	
    private Date plansdate;
    
    private Date planedate;
    
    private String planGoodsId;
    

	public Date getPlanedate() {
		return planedate;
	}

	public void setPlanedate(Date planedate) {
		this.planedate = planedate;
	}

	public String getPlanGoodsId() {
		return planGoodsId;
	}

	public void setPlanGoodsId(String planGoodsId) {
		this.planGoodsId = planGoodsId;
	}

	public Date getPlansdate() {
		return plansdate;
	}

	public void setPlansdate(Date plansdate) {
		this.plansdate = plansdate;
	}

	public String getPlanGoods() {
		return planGoods;
	}

	public void setPlanGoods(String planGoods) {
		this.planGoods = planGoods;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getPrtid() {
		prtid =  prtid==null?getGoodsid():prtid;
		return prtid;
	}

	public void setPrtid(String prtid) {
		this.prtid = prtid;
	}

}
