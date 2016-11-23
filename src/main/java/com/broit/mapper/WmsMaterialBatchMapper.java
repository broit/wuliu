package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.WmsMaterialBatch;
import com.broit.model.dto.WmsMaterialDto;

public interface WmsMaterialBatchMapper <E> extends IBaseMapper<WmsMaterialDto>{

    int insertBatch(WmsMaterialBatch record);//新建批次
    
    int updateEntryList(WmsMaterialBatch record);
    
    int insert(WmsMaterialBatch record);
    
    int updateDeliveryList(WmsMaterialBatch record);
    
    int updateEntry(WmsMaterialBatch record);
    
    int updateDelivery(WmsMaterialBatch record);
    
    int deleteMaterialBatch(@Param ("materialid") String id);
    
    int updateBatchStockByEntry(WmsMaterialDto record);//删除最近入库记录时同步更新批次表库存量（本条不删除入库表记录）
    
    int updateBatchStockByDelivery(WmsMaterialDto record);//删除最近入库记录时同步更新批次表库存量（本条不删除入库表记录）
    
    int deleteByStock (WmsMaterialBatch batch);//删除记录时，删除批次表中库存量等于0的批次信息
    
    int countBatchid (String id);//按照ID查是否有数据
    
    List<WmsMaterialBatch> batchidList(String materialid);//按照ID查询最大序列号下的对应批次ID列表
}