package com.broit.dao;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.broit.bean.PageBean;
import com.broit.mapper.IBaseMapper;
import com.broit.model.IBaseModel;

@Repository
public abstract class AbstractCurdDao<M extends IBaseMapper<E>,E extends IBaseModel>
					implements ICurdService<E>{

	private M mapper;
	
	/**分页列表*/
	public PageBean<E> listPage(PageBean<E> page) {
		page.setRows(mapper.selectList(page));
		page.setCount(mapper.countList(page));
		return page;
	}
	
	/**加载记录*/
	public E selectByPrimaryKey(String id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	/**删除记录*/
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor={Exception.class,RuntimeException.class})
	public void deleteByPrimaryKey(String id) {
		String err = this.validateDelete(id);
		if(err!=null){
			throw new RuntimeException(err);
		}		
		this.deleteMethod(id);
	}
	
	/**不带验证的删除方法
	 * 被{@link #deleteByPrimaryKey(String)}调用<br/>
	 * <font color="red">不要在覆盖此方法的内容中调用{@link #deleteByPrimaryKey(String)},否则会死循环</font>
	 * */
	protected void deleteMethod(String id){
		mapper.deleteByPrimaryKey(id);
	}
	
	/**保存记录
	 * @param 实体类
	 * @param id 实体类的主键值
	 * */
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor={Exception.class,RuntimeException.class})
	public void saveOrUpdate(E record) {
		String err = this.validateSave(record);
		if(err!=null){
			throw new RuntimeException(err);
		}		
		this.saveMethod(record);
	}
	
	/**不带验证的保存方法*/
	protected void saveMethod(E record){
//		if(StringUtils.isEmpty(this.getPrimaryKeyValue(record))){
		if(StringUtils.isEmpty(record.getId())){
			mapper.insert(record);
		}else{
			mapper.updateByPrimaryKey(record);
		}
	}
	
	/**
	 * 保存前的验证方法
	 * @return 如果是null代表验证成功
	 * */
	protected String validateSave(E entity){
		return null;
	}
	
	/**
	 * 删除前的验证方法
	 * @return 如果是null代表验证成功
	 * */
	protected String validateDelete(String id){
		return null;
	}
	
	/**
	 * 返回实体类的主键值,用于保存时判断插入还是更新
	 * */
//	protected abstract String getPrimaryKeyValue(E entity);
	
	@Autowired
	private void setMapper(M mapper){
		this.mapper = mapper;
	}
	
	protected M getMapper(){
		return mapper;
	}
}
