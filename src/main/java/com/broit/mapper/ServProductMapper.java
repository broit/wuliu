package com.broit.mapper;

import java.util.List;

import com.broit.model.ServProduct;
import com.broit.model.dto.ServProductDto;

public interface ServProductMapper extends IBaseMapper<ServProduct> {
	
	/**根据名称计数 */
    int countByName(ServProduct entity);
    
    /**根据编码计数 */
    int countByCode(ServProduct entity);
    
    /**订单产品计数*/
    int countFromServOrderPrt(String id);
    
    /**模具产品计数*/
    int countFromAccMouldPrt(String id);
    
    /**成品半成品计数*/
    int countFromWmsGoods(String id);
    
    /**根据产品ID删除组合产品*/
    void deleteFromPrtPart(String id);
    
    /**所以产品列表*/
    List<ServProduct> allProduct(String name);
    
    /**
     * 查询组合产品的单品
     * @param prtid 组合产品ID
     * @return 单品列表
     * */
    List<ServProduct> selectFromProductPartByPrtid(String prtid);
    
    /**
     * 根据订单ID查询产品和单品
     * @param orderid 订单ID
     * */
    List<ServProductDto> selectOrderProductPart(String orderid);
    
    List<ServProductDto> servProduct(String goodsId);
}