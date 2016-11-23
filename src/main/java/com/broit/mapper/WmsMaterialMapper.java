package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.PageBean;
import com.broit.model.WmsMaterial;
import com.broit.model.WmsMaterialDelivery;
import com.broit.model.WmsMaterialEntry;
import com.broit.model.dto.WmsMaterialDto;


public interface WmsMaterialMapper<E> extends IBaseMapper<WmsMaterialDto>{
    List<WmsMaterialDto> check(@Param("id")String id);
    
    int updateEntryList(WmsMaterialEntry record);
    
    int updateDeliveryList(WmsMaterialDelivery record);
    
    int count(@Param("name")String name);//列表数量
    
    int validateName(@Param("name")String name,@Param("mark")String mark,@Param("id")String id);//名称验证
    
    int updateMaterialStockByEntry(WmsMaterialDto record);//删除最近入库记录时同步更新批次表库存量（本条不删除入库表记录）
   
    int updateMaterialStockByDelivery(WmsMaterialDto record);//删除最近出库记录时同步更新批次表库存量（本条不删除出库表记录）
    
    List<WmsMaterialDto> selectEntryStock(PageBean<WmsMaterialDto> page);
    
    int countEntryStock(PageBean<WmsMaterialDto> page);
    
    List<WmsMaterialDto> selectDeliveryStock(PageBean<WmsMaterialDto> page);
    
    int countDeliveryStock(PageBean<WmsMaterialDto> page);
    
    WmsMaterial forecast(@Param("materialId")String id);//根据ID查库存，预报警调用
}