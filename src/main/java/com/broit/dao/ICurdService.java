package com.broit.dao;

import com.broit.bean.PageBean;
import com.broit.model.IBaseModel;

/**基础增删改查DAO接口*/
public interface ICurdService<E extends IBaseModel> {

	/**列表方法*/
	PageBean<E> listPage(PageBean<E> page);
	
	/**保存方法*/
	void saveOrUpdate(E entity);
	
	/**根据主键查询*/
	E selectByPrimaryKey(String id);
	
	/**删除方法*/
	void deleteByPrimaryKey(String id);
}
