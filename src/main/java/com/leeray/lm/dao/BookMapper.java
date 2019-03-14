package com.leeray.lm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leeray.lm.entity.Book;
import com.leeray.lm.entity.BookCustom;
import com.leeray.lm.entity.BookExample;

public interface BookMapper {
	int countByExample(BookExample example);

    int deleteByExample(BookExample example);

    int deleteByPrimaryKey(String bno);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    Book selectByPrimaryKey(String bno);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    
    //联合book和bookkind查找
    public List<BookCustom> findBookByName(String name);
    
    //根据图书号bno查询图书信息
    public BookCustom findBookByBNO(String bno);
    
    //根据rno来查找借阅的所有图书信息和图书种类信息
    List<BookCustom> findBookListByRNO(String rno);
}