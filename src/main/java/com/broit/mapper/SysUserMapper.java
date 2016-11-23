package com.broit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.broit.model.BaseTeam;
import com.broit.model.SysUser;
import com.broit.model.dto.SysRolefuncDto;

public interface SysUserMapper extends IBaseMapper<SysUser>{

    int validateUserCode(SysUser bean);//用户登录名不能重复添加验证    
     
    Integer isSysManager(@Param("id")String id);//查询是不是系统管理员

    /**查询角色的所有功能操作*/
    List<SysRolefuncDto> selectFuncOper(List<String> roleIdList);
    
    /**根据车间id查询班组*/
    List<BaseTeam> selectTeamByWsid(@Param("wsid")String wsid);
    
    /**加载表单数据*/
    SysUser loadForm(@Param("id")String id);
    
    /**启用或者禁用用户*/
    void beOrdisAble(SysUser user);
    
    /**查询班组下的成员*/
    List<SysUser> selectUserByTeamid(@Param("teamid")String teamid);
    
    /**按照用户名查询密码*/
    SysUser userPassword(@Param("code")String code);
    
    /**修改密码*/
    int modify(@Param("id")String id,@Param("password")String genPass);
}