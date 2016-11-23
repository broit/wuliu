package com.broit.mapper;

import java.util.List;

import com.broit.model.ServCustomer;

public interface ServCustomerMapper extends IBaseMapper<ServCustomer> {

	int name(ServCustomer record);
	
	int order(String id);
	
	List<ServCustomer> selectAll();
}