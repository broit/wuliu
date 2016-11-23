package com.broit.mapper;

import com.broit.model.SysNo;

public interface SysNoMapper extends IBaseMapper<SysNo>{
	
	/**根据类型查询编号*/
	SysNo selectByType(String type);
	
	/**保存最新的编号*/
	void merge(SysNo no);
}