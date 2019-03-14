package com.leeray.lm.service;

import com.leeray.lm.entity.Reader;
import com.leeray.lm.entity.ReaderCustom;

/**
* @author leeray
* @version 创建时间：2018年12月2日 下午6:35:40
* <br>描述：<br>
*/


public interface ReaderService {

	//注册用户
	public int addReader(Reader reader);
	
	//根据读者读书号删除
	public int deleteReader(String rno);
	
	//检查用户信息，用于登录
	public int checkReader(Reader rd);
	
	//根据id查找用户信息
	public Reader findUserById(String rno);
	
	//根据id查找用户信息，同时要查找借阅图书的数量
	public ReaderCustom findReaderByRNO(String rno);
	
	//更新用户信息
	public int updateReader(Reader rd);
	
}
