package com.broit.dao.sys;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.broit.bean.PageBean;
import com.broit.dao.AbstractCurdDao;
import com.broit.mapper.SysFuncMapper;
import com.broit.model.SysFunc;
import com.broit.model.dto.SysFuncDto;


@Repository
public class SysFuncDao extends AbstractCurdDao<SysFuncMapper<SysFuncDto>,SysFuncDto>{
	   
	Log log = LogFactory.getLog(this.getClass());
	
	/**
	 * 查询所属功能
	 * */
	public PageBean<SysFunc> parentList(PageBean<SysFunc> page) {
		List<SysFunc> list = this.getMapper().parentList(page.getParam().getFuncUid());
		SysFunc root = new SysFunc();
		root.setFuncName("根节点");
		root.setFuncUid("root");
		list.add(0, root);
		page.setRows(list);
		page.setCount(list.size());
		return page;
	}

	@Override
	public SysFuncDto selectByPrimaryKey(String id) {
		SysFuncDto func = this.getMapper().loadForm(id);
		SysFuncDto root = new SysFuncDto();
		root.setFuncName("根节点");
		root.setFuncUid("root");
		func.getOtherFuncs().add(0, root);
		return func;
	}
	
	/**唯一验证*/
	@Override
	protected String validateSave(SysFuncDto entity){
		if(this.getMapper().countByCode(entity)>0){
			return "功能编码重复";
		}
		return null;
	}
}
