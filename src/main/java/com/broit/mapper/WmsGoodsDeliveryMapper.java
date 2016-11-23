package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.PageBean;
import com.broit.model.WmsGoodsDelivery;
import com.broit.model.dto.WmsGoodsDeliveryConfirm;
import com.broit.model.dto.WmsGoodsDeliveryDto;

public interface WmsGoodsDeliveryMapper<E> extends IBaseMapper<WmsGoodsDeliveryDto>{
    
    List<WmsGoodsDelivery> selectListByID(String goodsId);;//查询入库表（关联了原料表和批次表）

    void insertList(WmsGoodsDeliveryDto goodsDeliveryList);
    
    int countDeliveryList(PageBean<WmsGoodsDeliveryDto> page);
    
    List<WmsGoodsDeliveryDto> selectListByID(PageBean<WmsGoodsDeliveryDto> page);
    
    int deleteGoodsDelivery(@Param ("goodsId") String id);    
    
    int deleteDeliveryBySerial(WmsGoodsDelivery record);//删除出库记录，根据出库序列号（在前台出库-删除最近批次调用）
    
    /**
     * 根据订单ID删除待出库
     * @param orderid 订单ID
     * */
    int deleteByOrderid(String orderid);
    
    /**
     * 根据订单产品ID删除待出库
     * @param orderprtid 订单产品ID
     * */
    int deleteByOrderPrtid(String orderprtid);
    
    List<WmsGoodsDeliveryDto>selectDeliveryWait(PageBean<WmsGoodsDeliveryDto> page);
    
    int  countDeliveryWait(PageBean<WmsGoodsDeliveryDto> page);
    
    List<WmsGoodsDeliveryConfirm> deliveryConfirm(PageBean<WmsGoodsDeliveryConfirm> page);
    
    int  countDeliveryConfirm(PageBean<WmsGoodsDeliveryConfirm> page);
    
    List<WmsGoodsDeliveryConfirm> deliveryCheck(PageBean<WmsGoodsDeliveryConfirm> page);
    
    int  countDeliveryCheck(PageBean<WmsGoodsDeliveryConfirm> page);
    
    int updateStatus(WmsGoodsDelivery delivery);
    
    List<WmsGoodsDelivery> selectByStatus(String goodsId);
    
    int countAllocatenum (String goodsId);
    
    int deleteByDelivery(String planId,String refid);
    
    int insertByRefid(String refid);
}