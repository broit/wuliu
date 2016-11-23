package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.PageBean;
import com.broit.model.WmsColorEntry;
import com.broit.model.dto.WmsColorEntryDto;

public interface WmsColorEntryMapper <E> extends IBaseMapper<WmsColorEntryDto>{
    
    int deleteColorEntry(@Param ("colorId") String id);
    
    void insertList(WmsColorEntryDto materialEntryList);
    
    List<WmsColorEntryDto> selectListByID(PageBean<WmsColorEntryDto> page);
    
    List<WmsColorEntry> selectListByID(String colorId);//查询批次表关联物料表，在前台入库按钮调用 

    int deleteEntryBySerial(WmsColorEntry record);//删除入库记录，根据入库序列号（在前台入库-删除最近批次调用）
    
    int countColorList(PageBean<WmsColorEntryDto> page);
    
    WmsColorEntry  selectByMaxTime(String colorId);
}