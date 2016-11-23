package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.PageBean;
import com.broit.model.WmsGoodsEntry;
import com.broit.model.dto.WmsGoodsEntryDto;

public interface WmsGoodsEntryMapper  <E> extends IBaseMapper<WmsGoodsEntryDto>{
    int deleteGoodsEntry(@Param ("goodsId") String id);
    
    void insertList(WmsGoodsEntryDto materialEntryList);
    
    List<WmsGoodsEntry> selectListByID(String goodsId);//查询批次表关联物料表，在前台入库按钮调用 
    
    int deleteEntryBySerial(WmsGoodsEntry record);//删除入库记录，根据入库序列号（在前台入库-删除最近批次调用）
    
    List<WmsGoodsEntryDto> selectListByID(PageBean<WmsGoodsEntryDto> page);
    
    int countEntryList(PageBean<WmsGoodsEntryDto> page);
    
    List<WmsGoodsEntryDto>selectEntryWait(PageBean<WmsGoodsEntryDto> page);
    
    int  countEntryWait(PageBean<WmsGoodsEntryDto> page);
    
    WmsGoodsEntryDto entryConfirm(String goodsId);
    
    int updateStatus(WmsGoodsEntry record);
    
    WmsGoodsEntry  selectByMaxTime(String goodsId);
    
    WmsGoodsEntryDto selectToStatus(String id);
}