package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.AccImm;
import com.broit.model.AccMould;
import com.broit.model.PrdLine;
import com.broit.model.SysUser;
import com.broit.model.dto.PrdLineDto;

public interface PrdLineMapper extends IBaseMapper<PrdLineDto>{
	
	/**注塑机列表(不分页)*/
	List<AccImm> immList();
	
	/**模具机列表(不分页)*/
	List<AccMould> mouldList();
	
	/**根据名称计数*/
	Integer countByName(PrdLineDto dto);
	
	/**根据编码计数*/
	Integer countByCode(PrdLineDto dto);
	
	/**根据注塑机和模具计数*/
	Integer countByImmAndMould(PrdLineDto dto);
	
	/**根据注塑机查询当前生产线*/
	PrdLine selectCurrentLineByImmid(String immid);
	
	/**加载表单*/
	PrdLineDto loadForm(String id);
	
	/**切换状态*/
	void switchStatus(PrdLineDto line);
	
	/**全部生产线*/
	List<PrdLineDto> allList();
	
	/**根据产品ID查询生产线*/
	List<PrdLineDto> selectByPrtid(String prtid);
	
	/**把注塑机关联的生产线状态设为不是当前生产线*/
	void reSetCurrentStatusByImmid(String immid);
	
	/**
	 * 查询有用户有权限的注塑机
	 * */
	List<String> selectImmByUser(SysUser user);
	
	/**查询注塑机的通道*/
	List<String> selectImmProtoList(String immid);
	
	/**根据生产计划ID关联生产线，取检测延迟时间 **/
	PrdLine selectByPlanId(String planid);
	
	List<PrdLineDto> paramList(String id);//静态参数列表
	
	int countPrd(String id);//查询该注塑机是否使用
	
	int countMould(String id);//查询该模具是否使用
	
	/**查询生产线是否排产过*/
	Integer countDispatchByLineid(String id);
	
	/**修改生产线状态*/
	void updateLineFlagById(@Param(value="flag")String flag,@Param(value="id")String id);
}