package com.broit.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.bean.LoginUserBean;
import com.broit.bean.PageBean;
import com.broit.model.PrdPlan;
import com.broit.model.dto.DataImmCycle;
import com.broit.model.dto.ImmDashBoardDto;
import com.broit.model.dto.PrdPlanDto;

public interface PrdPlanMapper extends IBaseMapper<PrdPlanDto>{
	
	/**
	 * 查询生产计划使用的注塑机
	 * @param id 生产计划id
	 * */
	String selectImmid(String id);
	
	/**
	 * 根据注塑机ID查询未完成的生产计划
	 * @param immid 注塑机ID
	 * */
	List<PrdPlan> selectByImmid(PrdPlanDto dto);
	
	/**根据加工产品ID查询生产计划
	 * @param prtid 加工产品id (serv_order_prt,prd_plan_goods,prd_plan_direct)
	 * */
	List<PrdPlan> selectByPrtid(String prtid);
	
	/**设备计划列表*/
	List<PrdPlanDto> selectImmPlanList(PageBean<PrdPlanDto> page);

	/**设备计划计数*/
	int countImmPlanList(PageBean<PrdPlanDto> page);
	
	/**设备所有计划列表*/
	List<PrdPlanDto> selectAllImmPlanList(PageBean<PrdPlanDto> page);
	
	/**所有计划列表*/
	List<PrdPlanDto> selectAllPlanList();
	
	/**用户权限能看到计划执行列表*/
	List<PrdPlanDto> selectExecuteImmPlanList(PageBean<PrdPlanDto> page);
	
	/**用户权限能看到计划执行计数*/
	int countExecuteImmPlanList(PageBean<PrdPlanDto> page);
	
	/**用户权限能看到的计划列表*/
	List<PrdPlanDto> selectPlanByUser(LoginUserBean loginUserBean);
	
	PrdPlan selectByServOrderPrt(String id);
	
	PrdPlan selectByPrdPlanGoods(String id);
	
	PrdPlan selectByPrdPlanDirect(String id);
	
	/**用户权限能查看到的注塑机*/
	List<ImmDashBoardDto> selectImmPlanByUser(LoginUserBean loginUserBean);
	
	/**根据 id查询注塑机状态 */
	ImmDashBoardDto selectImmPlanById(String id);
	
	/**查询注塑机实时参数*/
	List<DataImmCycle> selectImmData(@Param(value="immid")String immid,@Param(value="cycledate")String cycledate);
	
	/**根据日期和ID查询注塑机最大周期数据*/
	BigDecimal selectCycleDataByDate(@Param(value="immid")String immid,@Param(value="cycledate")String cycledate);
}