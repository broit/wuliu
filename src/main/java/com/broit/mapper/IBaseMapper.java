package com.broit.mapper;

import java.util.List;

import com.broit.bean.PageBean;
import com.broit.model.IBaseModel;

/**默认数据库操作接口*/
public interface IBaseMapper<E extends IBaseModel> {

	/**分页列表*/
	List<E> selectList(PageBean<? super E> page);
	
	/**功能列表计数*/
    int countList(PageBean<? super E> page);
    
    /**插入*/
    int insert(E record);
    
    /**选择性插入*/
    int insertSelective(E record);
    
    /**删除*/
    int deleteByPrimaryKey(String id);
    
    /**查询*/
    E selectByPrimaryKey(String id);
    
    /**选择性更新*/
    int updateByPrimaryKeySelective(E record);
    
    /**更新*/
    int updateByPrimaryKey(E record);
}
