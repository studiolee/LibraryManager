package com.leeray.lm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leeray.lm.dao.BookMapper;
import com.leeray.lm.entity.BookCustom;

/**
* @author leeray
* @version 创建时间：2018年12月4日 上午11:14:14
* <br>描述：<br>
*/

//对图书查询的测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ("classpath:/spring/spring-dao.xml"))
public class BookDaoTest {
	@Autowired
	private BookMapper bookMapper;
	
	
	//根据书名，模糊查询图书信息
	@Test
	public void findBookByNameTest(){
		List<BookCustom> list = bookMapper.findBookByName("电");
		for(BookCustom bc : list){
			System.out.println(bc);
		}
	}
	
	//根据图书号进行精确查找
	@Test
	public void findBookByBNOTest(){
		BookCustom bookCustom = bookMapper.findBookByBNO("9787115222817");
		System.out.println(bookCustom.getBname());
	}
	
	//根据rno来查找借阅的所有图书信息和图书种类信息
	@Test
	public void findBookListByRNOTest(){
		List<BookCustom> list = bookMapper.findBookListByRNO("J201602006");
		for(BookCustom bc : list){
			System.out.println(bc.getBname());
		}
	}
}
