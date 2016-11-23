package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.PageBean;
import com.broit.model.WmsColor;
import com.broit.model.WmsColorDelivery;
import com.broit.model.WmsColorEntry;
import com.broit.model.dto.WmsColorDto;

public interface WmsColorMapper <E> extends IBaseMapper<WmsColorDto>{
	
    List<WmsColorDto> check(@Param("id")String id);
	
    int updateDeliveryList(WmsColorDelivery record);
    
    int count(@Param("name")String name);//列表数量
    
    int updateEntryList(WmsColorEntry record);
    
    int validateName(@Param("name")String name,@Param("color")String color,@Param("mark")String mark,@Param("id")String id);//名称验证
    
    int updateMaterialStockByEntry(WmsColorDto record);//删除最近入库记录时同步更新批次表库存量（本条不删除入库表记录）
   
    int updateMaterialStockByDelivery(WmsColorDto record);//删除最近出库记录时同步更新批次表库存量（本条不删除出库表记录）
    
    List<WmsColorDto> selectEntryStock(PageBean<WmsColorDto> page);
    
    int countEntryStock(PageBean<WmsColorDto> page);
    
    List<WmsColorDto> selectDeliveryStock(PageBean<WmsColorDto> page);
    
    int countDeliveryStock(PageBean<WmsColorDto> page);
    
    WmsColor forecast(@Param("colorId")String colorId);//根据ID查库存，预报警调用
}