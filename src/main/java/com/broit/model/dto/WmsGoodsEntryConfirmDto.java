package com.broit.model.dto;

import com.broit.model.WmsGoodsEntry;

	public class WmsGoodsEntryConfirmDto extends WmsGoodsEntry{
		
		private String orderPrtId;
		
		private String ServOrderId;
		
		private String prdPlanGoodsId;
		
		private String prdPlanDirectId;

		public String getServOrderId() {
			return ServOrderId;
		}

		public void setServOrderId(String servOrderId) {
			ServOrderId = servOrderId;
		}

		public String getOrderPrtId() {
			return orderPrtId;
		}

		public void setOrderPrtId(String orderPrtId) {
			this.orderPrtId = orderPrtId;
		}

		public String getPrdPlanGoodsId() {
			return prdPlanGoodsId;
		}

		public void setPrdPlanGoodsId(String prdPlanGoodsId) {
			this.prdPlanGoodsId = prdPlanGoodsId;
		}

		public String getPrdPlanDirectId() {
			return prdPlanDirectId;
		}

		public void setPrdPlanDirectId(String prdPlanDirectId) {
			this.prdPlanDirectId = prdPlanDirectId;
		}
		
}