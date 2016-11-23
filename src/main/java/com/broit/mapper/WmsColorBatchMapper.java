package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.WmsColorBatch;
import com.broit.model.dto.WmsColorDto;

public interface WmsColorBatchMapper <E> extends IBaseMapper<WmsColorDto>{
    
    int deleteColorBatch(@Param ("colorId") String id);
    
    int insertBatch(WmsColorBatch record);//新建批次
    
    int insert(WmsColorBatch record);
    
    int updateDeliveryList(WmsColorBatch record);
    
    int updateEntryList(WmsColorBatch record);
    
    int updateBatchStockByEntry(WmsColorDto record);//删除最近入库记录时同步更新批次表库存量（本条不删除入库表记录）
    
    int updateBatchStockByDelivery(WmsColorDto record);//删除最近入库记录时同步更新批次表库存量（本条不删除入库表记录）
    
    int deleteByStock (WmsColorBatch batch);//删除记录时，删除批次表中库存量等于0的批次信息
    
    int countBatchid (String id);//按照ID查是否有数据
    
    List<WmsColorBatch> batchidList(String colorId);//按照ID查询最大序列号下的对应批次ID列表
}