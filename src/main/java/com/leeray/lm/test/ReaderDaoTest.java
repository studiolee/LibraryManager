package com.leeray.lm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leeray.lm.dao.ReaderMapper;
import com.leeray.lm.entity.ReaderCustom;

/**
* @author leeray
* @version 创建时间：2018年12月4日 下午5:07:32
* <br>描述：<br>
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ("classpath:/spring/spring-dao.xml"))
public class ReaderDaoTest {
	@Autowired
	private ReaderMapper readerMapper;
	
	@Test
	public void findReaderByRNOTest(){
		ReaderCustom rdCus = readerMapper.findReaderByRNO("J201602006");
		System.out.println(rdCus.getJyCount());
	}
}
