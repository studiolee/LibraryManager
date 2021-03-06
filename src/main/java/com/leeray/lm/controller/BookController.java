package com.leeray.lm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leeray.lm.entity.BookCustom;
import com.leeray.lm.entity.QueryCustom;
import com.leeray.lm.service.BookService;

/**
 * @author leeray
 * @version 创建时间：2018年12月4日 上午11:47:07 <br>
 *          描述：<br>
 */

@Controller
@RequestMapping("book")
public class BookController {
	@Autowired
	private BookService bookService;

	// 模糊查询图书
	@RequestMapping("findBookByName")
	public String findBookByName(@RequestParam(value = "bname") String bname, Model model) {
		List<BookCustom> bookList = bookService.findBookByName(bname);
		// 这里的判断既要判断不等于null,也要判断非空的情况
		if (bookList != null && !bookList.isEmpty()) {
			model.addAttribute("bookList", bookList);
		} else {
			model.addAttribute("message1", "没有查到相关书籍，请重新输入");
		}
		return "success";
	}

	// 根据图书号精确查找
	@RequestMapping("findBookByBNO")
	public String findBookByBNO(@RequestParam(value = "bno") String bno, Model model) {
		BookCustom bookCustom = bookService.findBookByBNO(bno);
		if (bookCustom != null) {
			model.addAttribute("_book", bookCustom);
		} else {
			model.addAttribute("message2", "没有找到对应书号的图书请重新输入！");
		}
		return "success";
	}

	// 根据rno来查找借阅的所有图书信息和图书种类信息
	@RequestMapping("findBookListByRNO")
	public String findBookListByRNO(@RequestParam(value = "rno2") String rno, Model model) {
		QueryCustom queryCustom = new QueryCustom();
		List<BookCustom> bookList = bookService.findBookListByRNO(rno);
		List<QueryCustom> bookList1 = new ArrayList<QueryCustom>();
		for (int i = 0; i < bookList.size(); i++) {
			QueryCustom temp = new QueryCustom();
			temp.setBook(bookList.get(i));
			bookList1.add(temp);
		}
		for (int i = 0; i < bookList1.size(); i++) {

			Date date1 = bookList1.get(i).getBook().getRdate();
			Date date2 = new Date();

			int res = date1.compareTo(date2);
			if (res == 1) {
				bookList1.get(i).setIsOntime("准时");
			} else {
				bookList1.get(i).setIsOntime("超时！");
			}
		}

		if (bookList1 != null && !bookList1.isEmpty()) {
			model.addAttribute("bookList", bookList1);
		} else {
			model.addAttribute("message3", "你没有借阅图书!");
		}
		return "userInfo";
	}
}
