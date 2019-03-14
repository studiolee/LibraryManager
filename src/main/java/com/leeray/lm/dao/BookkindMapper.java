package com.leeray.lm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leeray.lm.entity.Bookkind;
import com.leeray.lm.entity.BookkindExample;

public interface BookkindMapper {
    int countByExample(BookkindExample example);

    int deleteByExample(BookkindExample example);

    int deleteByPrimaryKey(String bkno);

    int insert(Bookkind record);

    int insertSelective(Bookkind record);

    List<Bookkind> selectByExample(BookkindExample example);

    Bookkind selectByPrimaryKey(String bkno);

    int updateByExampleSelective(@Param("record") Bookkind record, @Param("example") BookkindExample example);

    int updateByExample(@Param("record") Bookkind record, @Param("example") BookkindExample example);

    int updateByPrimaryKeySelective(Bookkind record);

    int updateByPrimaryKey(Bookkind record);
}