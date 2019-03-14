package com.leeray.lm.entity;

import java.util.Date;

/**
 * @author leeray
 * @version 创建时间：2018年12月4日 上午10:56:40 <br>
 * 			描述：<br>
 */

/*
 * 创建自定义书籍类
 */
public class BookCustom extends Book {

	// 定义图书类别名称
	private String bkname;

	// 应该归还的日期
	private Date rdate;
	
	//日期类型在网页上的显示效果对用户不友好，需要创建一个String类型的属性来存储简单日期类型
	private String dateFormat;
	
	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

	public String getBkname() {
		return bkname;
	}

	public void setBkname(String bkname) {
		this.bkname = bkname;
	}

}
