package com.leeray.lm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leeray.lm.entity.Jy;
import com.leeray.lm.entity.JyExample;
import com.leeray.lm.entity.JyKey;

public interface JyMapper {
	int countByExample(JyExample example);

    int deleteByExample(JyExample example);

    int deleteByPrimaryKey(JyKey key);

    int insert(Jy record);

    int insertSelective(Jy record);

    List<Jy> selectByExample(JyExample example);

    Jy selectByPrimaryKey(JyKey key);

    int updateByExampleSelective(@Param("record") Jy record, @Param("example") JyExample example);

    int updateByExample(@Param("record") Jy record, @Param("example") JyExample example);

    int updateByPrimaryKeySelective(Jy record);

    int updateByPrimaryKey(Jy record);
}