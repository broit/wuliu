package com.broit.controller.sys;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.broit.controller.BaseController;
import com.broit.dao.sys.SysParamDao;
import com.broit.model.SysParam;

@Controller
@Scope("prototype")
@RequestMapping(value="/param")
public class ParamController extends BaseController<SysParamDao,SysParam>{

	/**根据类型查询字典*/
	@RequestMapping(value={"/selectByType"},method = RequestMethod.GET)
	@ResponseBody
	public List<SysParam> selectByType(SysParam param){
		return this.getDao().selectByType(param);
	}
}
