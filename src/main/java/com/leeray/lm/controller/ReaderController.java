package com.leeray.lm.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.leeray.lm.entity.QueryCustom;
import com.leeray.lm.entity.Reader;
import com.leeray.lm.entity.ReaderCustom;
import com.leeray.lm.service.ReaderService;

/**
 * @author leeray
 * @version 创建时间：2018年12月2日 下午7:50:10 <br>
 *          描述：<br>
 */
@Controller
@RequestMapping("reader")
// 将rd保存再session域中，这样它的生命周期即使直到会话结束（浏览器关闭）
@SessionAttributes("rd")
public class ReaderController {

	@Autowired
	private ReaderService readerService;

	// 导向登录页面
	@RequestMapping("index")
	public String toIndex() {
		return "index";
	}

	// 导向注册页面
	@RequestMapping("toRegister")
	public String toRegister() {
		return "register";
	}

	// 导向用户信息界面
	@RequestMapping("toUserInfo")
	public String toUserInfo(Model model) {
		return "userInfo";
	}

	// 导向用户信息界面
	@RequestMapping("toBookInfo")
	public String toBookInfo(Model model) {
		return "success";
	}

	// 注册
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(Reader rd, Model model) {
		rd.setRstate("可用"); // 新注册的用户的读者状态默认为可用
		readerService.addReader(rd);
		model.addAttribute("rd", rd);
		return "success";
	}

	// 根据id删除用户，功能有待完善
	@RequestMapping("deleteReader")
	public String deleteReader(String rno) {
		readerService.deleteReader(rno);
		return "success";
	}

	// 登录，检查读者信息
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(Reader rd, Model model) {
		if (readerService.checkReader(rd) == 1) {
			model.addAttribute("rd", rd);
			return "success";
		}
		return "fail";
	}

	// 根据rno查询用户的信息,同时要查到借阅的图书数量
	@RequestMapping("searchYourInfo")
	public String searchYourInfo(@RequestParam(value = "rno1") String rno, Model model) {
		ReaderCustom rdInfo = readerService.findReaderByRNO(rno);
		model.addAttribute("rdInfo", rdInfo);
		System.out.println("sdhh");
		return "userInfo";
	}

	// 接收传来的rno查到reader返回给修改页面
	@RequestMapping("openUpdateReaderInfo")
	public String openUpdateReaderInfo(@RequestParam(value = "rno3") String rno, Model model) {
		Reader rd = readerService.findUserById(rno);
		model.addAttribute("rdInfoToUpdate", rd);
		return "userInfo";
	}

	// 根据表单提交读者信息更新读者信息
	//从前端传来的文件reader_pic是file类型，是不能直接映射到reader对象的pic属性上的。必须先处理然后set进去
	@RequestMapping(value = "updateReader", method = RequestMethod.POST)
	public String updateReader(Reader rd, Model model,@RequestParam(value="reader_pic") MultipartFile reader_pic) throws IllegalStateException, IOException {
		//原始名称
		String originalFilename = reader_pic.getOriginalFilename();
		//上传图片
		if(reader_pic != null && originalFilename != null && originalFilename.length()>0){
			//存储图片的物理路径
			String pic_path = "D:\\LNApp\\picture\\lm\\";
			//新的图片名称
		    String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
		    //新图片
		    File newFile = new File(pic_path+newFileName);
		    //将内存中的数据写入磁盘
		    reader_pic.transferTo(newFile);
		    //设置属性
		    rd.setPic(newFileName);
		}
		if (readerService.updateReader(rd) == 1) {
			// 如果修改成功，那么再次查找该读者的信息和借阅信息
			ReaderCustom rdInfo = readerService.findReaderByRNO(rd.getRno());
			model.addAttribute("rdInfo", rdInfo);
			return "userInfo";
		}
		return "fail";
	}
}
