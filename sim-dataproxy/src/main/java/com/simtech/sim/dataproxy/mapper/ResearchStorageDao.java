package com.simtech.sim.dataproxy.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.simtech.sim.dataproxy.entity.db.ResearchEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResearchStorageDao extends BaseMapper<ResearchEntity> {
}
