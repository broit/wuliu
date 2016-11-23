package com.broit.controller.sys;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.broit.controller.BaseController;
import com.broit.dao.sys.SysOperDao;
import com.broit.model.SysOper;

@Controller
@Scope("prototype")
@RequestMapping(value="/oper")
public class OperController extends BaseController<SysOperDao, SysOper>{

}
