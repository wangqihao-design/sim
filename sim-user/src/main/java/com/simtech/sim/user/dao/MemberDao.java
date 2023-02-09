package com.simtech.sim.user.dao;

import com.simtech.sim.user.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author CharlieWang
 * @email wan2901@dcds.edu
 * @date 2023-02-08 20:54:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
