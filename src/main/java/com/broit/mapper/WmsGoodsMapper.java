package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.PageBean;
import com.broit.model.WmsGoods;
import com.broit.model.WmsGoodsDelivery;
import com.broit.model.WmsGoodsEntry;
import com.broit.model.dto.WmsGoodsDto;

public interface WmsGoodsMapper extends IBaseMapper<WmsGoodsDto>{
	
	List<WmsGoodsDto> check(@Param("id")String id);
    
    int updateDeliveryList(WmsGoodsDelivery record);
    
    int count(@Param("name")String name);//列表数量
    
    int updateEntryList(WmsGoodsEntry record);
    /**成品、半成品唯一标识验证*/
    int validateTypeC(@Param("prtid")String prtid,@Param("type")String type,@Param("id")String id);
    
    /**   删除最近入库记录时同步更新批次表库存量（本条不删除入库表记录）*/
    int updateMaterialStockByEntry(WmsGoodsDto record);
    /** 删除最近出库记录时同步更新批次表库存量（本条不删除出库表记录）*/
    int updateMaterialStockByDelivery(WmsGoodsDto record);
    /** 前台搜索框 ————名称(从产品表查)*/
	List<WmsGoodsDto> selectNameList();
	
	List<WmsGoodsDto> selectAll();
	
    List<WmsGoodsDto> selectEntryStock(PageBean<WmsGoodsDto> page);
    
    int countEntryStock(PageBean<WmsGoodsDto> page);
    
    List<WmsGoodsDto> selectDeliveryStock(PageBean<WmsGoodsDto> page);
    
    int countDeliveryStock(PageBean<WmsGoodsDto> page);
    
    WmsGoods selectByPrtid(String prtid);
    
    List<WmsGoodsDto> selectByGoods();
    
    List<WmsGoodsDto> planGoodsList();
}