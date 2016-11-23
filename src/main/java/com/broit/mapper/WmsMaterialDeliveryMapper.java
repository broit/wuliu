package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.PageBean;
import com.broit.model.WmsMaterialDelivery;
import com.broit.model.dto.WmsMaterialDeliveryDto;


public interface WmsMaterialDeliveryMapper <E> extends IBaseMapper<WmsMaterialDeliveryDto> {
   
    void insertList(WmsMaterialDeliveryDto materialDeliveryList);

    List<WmsMaterialDeliveryDto> selectListByID(PageBean<WmsMaterialDeliveryDto> page);//查询入库表（关联了原料表和批次表）

    void insertList(List<WmsMaterialDelivery> materialDeliveryList);
    
    int deleteMaterialDelivery(@Param ("materialid") String id);  
    
    int countDeliveryList(PageBean<WmsMaterialDeliveryDto> page);
    
    int deleteDeliveryBySerial(WmsMaterialDelivery record);//删除出库记录，根据出库序列号（在前台出库-删除最近批次调用）
}