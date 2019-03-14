package com.leeray.lm.service;

import java.util.List;

import com.leeray.lm.entity.BookCustom;

/**
* @author leeray
* @version 创建时间：2018年12月4日 上午11:41:56
* <br>描述：<br>
*/
public interface BookService {
	//根据图书名称进行模糊查询
	public List<BookCustom> findBookByName(String name);
	
	//根据图书号进行精确查找
	public BookCustom findBookByBNO(String bno);
	
	//根据rno来查找借阅的所有图书信息和图书种类信息
	public List<BookCustom> findBookListByRNO(String rno);
}
