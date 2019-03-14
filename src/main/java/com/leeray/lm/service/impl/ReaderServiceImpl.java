package com.leeray.lm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leeray.lm.dao.ReaderMapper;
import com.leeray.lm.entity.Reader;
import com.leeray.lm.entity.ReaderCustom;
import com.leeray.lm.service.ReaderService;

/**
 * @author leeray
 * @version 创建时间：2018年12月2日 下午6:37:13 <br>
 *          描述：<br>
 */

@Service
public class ReaderServiceImpl implements ReaderService {

	@Autowired
	private ReaderMapper readerMapper;

	// 添加读者
	public int addReader(Reader reader) {
		return readerMapper.insert(reader);
	}

	// 根据id删除读者
	public int deleteReader(String rno) {
		return readerMapper.deleteByPrimaryKey(rno);
	}

	// 检查读者信息是否正确 如果正确则返回1，错误则返回-1
	public int checkReader(Reader rd) {
		if (rd.getRno() == null || rd.getRname() == null)
			return -1;
		Reader reader = readerMapper.selectByPrimaryKey(rd.getRno());
		// 如果没查到reader,那么也直接返回-1
		if (reader == null)
			return -1;
		//注意这里判断相等要用equals而不能使用==,equals()只判断值，而==还要判断二者的地址是否相同
		if (rd.getRname().equals(reader.getRname()))
			return 1;
		return -1;
	}

	// 根据id查找用户信息
	public Reader findUserById(String rno) {
		Reader rd = readerMapper.selectByPrimaryKey(rno);
		return rd;
	}

	// 根据rno查找读者信息，同时查找借阅数量
	public ReaderCustom findReaderByRNO(String rno) {
		return readerMapper.findReaderByRNO(rno);
	}

	// 更新用户信息
	public int updateReader(Reader rd) {
		int i = readerMapper.updateByPrimaryKeySelective(rd);
		if (i == 1)
			return i;
		return -1;
	}

}
