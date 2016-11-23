package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.PageBean;
import com.broit.model.WmsColorDelivery;
import com.broit.model.dto.WmsColorDeliveryDto;

public interface WmsColorDeliveryMapper <E> extends IBaseMapper<WmsColorDeliveryDto>{
    
    List<WmsColorDelivery> selectListByID(String colorId);;//查询入库表（关联了原料表和批次表）
    
    void insertList(WmsColorDeliveryDto colorDeliveryList);
    
    int deleteColorDelivery(@Param ("colorId") String id);    
    
    int deleteDeliveryBySerial(WmsColorDelivery record);//删除出库记录，根据出库序列号（在前台出库-删除最近批次调用）
    
    List<WmsColorDeliveryDto> selectListByID(PageBean<WmsColorDeliveryDto> page);
    
    int countDeliveryList(PageBean<WmsColorDeliveryDto> page);
}