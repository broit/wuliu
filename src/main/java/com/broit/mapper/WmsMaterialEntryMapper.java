package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.PageBean;
import com.broit.model.WmsMaterialEntry;
import com.broit.model.dto.WmsMaterialEntryDto;

public interface WmsMaterialEntryMapper<E> extends IBaseMapper<WmsMaterialEntryDto>{
    int deleteMaterialEntry(@Param ("materialid") String id);

    void insertList(WmsMaterialEntryDto materialEntryList);

    List<WmsMaterialEntryDto> selectListByID(PageBean<WmsMaterialEntryDto> page);
    
    int deleteEntryBySerial(WmsMaterialEntry record);//删除入库记录，根据入库序列号（在前台入库-删除最近批次调用）
    
    int countEntryList(PageBean<WmsMaterialEntryDto> page);
    
    WmsMaterialEntry  selectByMaxTime(String materialid);
}