package com.leeray.lm.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leeray.lm.dao.BookMapper;
import com.leeray.lm.entity.BookCustom;
import com.leeray.lm.service.BookService;

/**
* @author leeray
* @version 创建时间：2018年12月4日 上午11:44:48
* <br>描述：<br>
*/

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookMapper bookMapper;
	
	//根据图书名称进行模糊查询
	public List<BookCustom> findBookByName(String name) {
		return bookMapper.findBookByName(name);
	}

	//根据图书号进行精确查找
	public BookCustom findBookByBNO(String bno) {
		return  bookMapper.findBookByBNO(bno);
	}

	//根据rno来查找借阅的所有图书信息和图书种类信息
	public List<BookCustom> findBookListByRNO(String rno) {
		//要对查询到的date类型数据进行转换，并赋给dateFormat属性
		List<BookCustom> bookList = bookMapper.findBookListByRNO(rno);
		for(BookCustom bl : bookList){
			SimpleDateFormat datefmt = new SimpleDateFormat("yyyy年MM月dd日");
			bl.setDateFormat(datefmt.format(bl.getRdate()));
		}
		return bookList;
	}

}
