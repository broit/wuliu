package com.broit.mapper;

import com.broit.model.BaseBranch;

public interface BaseBranchMapper<E> extends IBaseMapper<BaseBranch> {
    /**根据名称计数*/
    int countByName(BaseBranch branch);
    
    /**分公司下班组计数*/
    int countBranchWs(String id);
}