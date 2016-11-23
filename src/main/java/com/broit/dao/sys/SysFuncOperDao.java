package com.broit.dao.sys;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.broit.bean.FormResultBean;
import com.broit.bean.TreeNodeBean;
import com.broit.mapper.SysFuncOperMapper;
import com.broit.model.dto.FuncOperListDto;
import com.broit.model.dto.SysFuncOperDto;

@Repository
public class SysFuncOperDao {

	Log log = LogFactory.getLog(SysFuncDao.class);
	
	@Autowired
	private SysFuncOperMapper funcOperMapper;
	
	/**查询功能操作*/
	public FormResultBean<List<TreeNodeBean>> funcOperList(String funcUid){
		FormResultBean<List<TreeNodeBean>> result = new FormResultBean<List<TreeNodeBean>>();
		List<TreeNodeBean> list = new ArrayList<TreeNodeBean>();
		try{
			List<SysFuncOperDto> foList = funcOperMapper.funcOperList(funcUid);
			for(SysFuncOperDto fo : foList){
				TreeNodeBean node = new TreeNodeBean();
				node.setText(fo.getOperName());
				node.setValue(fo.getOperCode());
				node.setChecked(fo.getOperFunc()!=null);
				list.add(node);
			}
			result.setData(list);
			result.setSuccess(true);
		}catch(Exception e){
			result.setErrorMessage(e.getMessage());
		}
		return result;
	}
	
	/**保存功能操作*/
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor={Exception.class,RuntimeException.class})
	public void saveFuncOper(FuncOperListDto fo){
		funcOperMapper.deleteByFuncId(fo.getFuncUid());
		if(fo.getList()!=null
				&&!fo.getList().isEmpty()){
			funcOperMapper.batchInsertFuncOper(fo.getList());
		}
	}
}
