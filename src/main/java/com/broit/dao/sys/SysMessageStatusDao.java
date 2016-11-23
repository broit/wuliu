package com.broit.dao.sys;

import org.springframework.stereotype.Repository;

import com.broit.dao.AbstractCurdDao;
import com.broit.mapper.SysMessageStatusMapper;
import com.broit.model.SysMessageStatus;

@Repository
public class SysMessageStatusDao extends AbstractCurdDao<SysMessageStatusMapper<SysMessageStatus>,SysMessageStatus>{
	
}