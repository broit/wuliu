package com.broit.mapper;

import java.util.List;

import com.broit.model.SysMessage;

public interface SysMessageMapper<E> extends IBaseMapper<SysMessage>{
	
	/**
	 * 	查询未处理列表
	 */
	List<SysMessage> untreated();
	
	SysMessage selectByWarning(String id);
	
	SysMessage selectByYWarning(String id);

}