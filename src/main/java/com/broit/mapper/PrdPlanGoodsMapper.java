package com.broit.mapper;

import java.util.List;

import com.broit.model.dto.PrdPlanGoodsDto;

public interface PrdPlanGoodsMapper extends IBaseMapper<PrdPlanGoodsDto>{
   
    
    List<PrdPlanGoodsDto>planGoodsList(String goodsId);
}