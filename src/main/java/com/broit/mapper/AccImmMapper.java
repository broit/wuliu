package com.broit.mapper;

import java.util.List;

import com.broit.model.dto.AccCotsDto;
import com.broit.model.dto.AccImmDto;
import com.broit.model.dto.AccImmEquipmentDto;
import com.broit.model.dto.AccMouldDto;
import com.broit.model.dto.AccRobotDto;

public interface AccImmMapper<E> extends IBaseMapper<AccImmDto> {
	/**
     * 根据编码计数
     * */
    int countByNo(E entity);
    /**
     * 根据名称计数
     * @param entity
     * @return
     */
    int countByName(E entity);
    /**
     * 加载可用设备列表
     * @param immid
     * @return
     */
    AccImmEquipmentDto loadEquip(String id);
    /**
     * 注塑机可用设备-模具-删除
     */
    int deleteMould(String immid);
    /**
     * 注塑机可用设备-机械手-删除
     */
    int deleteRobot(String immid);
    /**
     * 注塑机可用设备-检测设备-删除
     */
    int deleteCots(String immid);
    /**
     * 注塑机可用设备-模具-批量插入
     * */
    void batchInsertImmMould(List<AccMouldDto> moulds);
    /**
     * 注塑机可用设备-机械手-批量插入
     * */
    void batchInsertImmRobot(List<AccRobotDto> robots);
    /**
     * 注塑机可用设备-检测设备-批量插入
     * */
    void batchInsertImmCots(List<AccCotsDto> cotss);
}