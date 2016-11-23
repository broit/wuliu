package com.broit.mapper;

import java.util.List;

import com.broit.model.PrdLineParam;
import com.broit.model.dto.PrdLineParamDto;

public interface PrdLineParamMapper<E> extends IBaseMapper<PrdLineParamDto>{

	/**根据模具id查询参数设置*/
	List<PrdLineParam> selectByLineid(String lineid);
}