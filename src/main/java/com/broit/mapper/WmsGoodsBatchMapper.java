package com.broit.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.WmsGoodsBatch;
import com.broit.model.dto.WmsGoodsBatchDto;
import com.broit.model.dto.WmsGoodsDto;

public interface WmsGoodsBatchMapper<E> extends IBaseMapper<WmsGoodsDto>{
    
    int deleteGoodsBatch(@Param ("goodsId") String id);
    
    int insertBatch(WmsGoodsBatch record);//新建批次
    
    int insert(WmsGoodsBatch record);
    
    int updateEntryList(WmsGoodsBatch record);
    
    int updateDeliveryList(WmsGoodsBatch record);
    
    int updateBatchStockByEntry(WmsGoodsDto record);//删除最近入库记录时同步更新批次表库存量（本条不删除入库表记录）
    
    int updateBatchStockByDelivery(WmsGoodsDto record);//删除最近入库记录时同步更新批次表库存量（本条不删除入库表记录）
    
    int deleteByStock (WmsGoodsBatch batch);//删除记录时，删除批次表中库存量等于0的批次信息
    
    int countBatchid (String id);//按照ID查是否有数据
    
    List<WmsGoodsBatch> batchidList(String materialid);//按照ID查询最大序列号下的对应批次ID列表
    
    List<WmsGoodsBatch> selectBatchName(String goodsId);
    
    /**查询成品的默认批次*/
    WmsGoodsBatchDto selectDefaultGoodsBatch(String goodsId);
    WmsGoodsBatchDto selectDefaultGoodsBatchById(String goodsId);
}