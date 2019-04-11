package com.leeray.lm.entity;
/**
* @author leeray
* @version 创建时间：2019年4月11日 下午5:42:17
* <br>描述：<br>
*/
public class QueryCustom {
	private BookCustom book;
	String isOntime;
	public BookCustom getBook() {
		return book;
	}
	public void setBook(BookCustom book) {
		this.book = book;
	}
	public String getIsOntime() {
		return isOntime;
	}
	public void setIsOntime(String isOntime) {
		this.isOntime = isOntime;
	}
	
	
}
