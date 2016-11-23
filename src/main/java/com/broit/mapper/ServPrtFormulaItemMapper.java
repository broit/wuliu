package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.ServPrtFormulaItem;
import com.broit.model.dto.ServPrtFormulaItemDto;

public interface ServPrtFormulaItemMapper extends IBaseMapper<ServPrtFormulaItem> {
	/**插入产品配方项*/
    void batchInsertFormulaItem(@Param("list")List<ServPrtFormulaItemDto> list);
}