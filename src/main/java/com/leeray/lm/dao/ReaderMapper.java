package com.leeray.lm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leeray.lm.entity.Reader;
import com.leeray.lm.entity.ReaderCustom;
import com.leeray.lm.entity.ReaderExample;

public interface ReaderMapper {
	int countByExample(ReaderExample example);

	int deleteByExample(ReaderExample example);

	int deleteByPrimaryKey(String rno);

	int insert(Reader record);

	int insertSelective(Reader record);

	List<Reader> selectByExample(ReaderExample example);

	Reader selectByPrimaryKey(String rno);

	int updateByExampleSelective(@Param("record") Reader record, @Param("example") ReaderExample example);

	int updateByExample(@Param("record") Reader record, @Param("example") ReaderExample example);

	int updateByPrimaryKeySelective(Reader record);

	int updateByPrimaryKey(Reader record);

	// 根据rno查找读者信息，同时查找借阅的图书数量
	ReaderCustom findReaderByRNO(String RNO);
}