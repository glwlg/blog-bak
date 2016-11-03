package com.glw.blog.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.glw.blog.bo.BloggerBO;
import com.glw.blog.dao.BloggerDao;
import com.glw.blog.manager.BloggerManager;
import com.glw.blog.pojo.Blogger;

public class BloggerManagerImpl implements BloggerManager{

	@Autowired
	BloggerDao bloggerDao;

	@Override
	public void createBlogger(Blogger blogger) {
		try {
			int i=bloggerDao.insertSelective(blogger);
			if (i<1) {
				System.out.println("blogger添加失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

	@Override
	public Blogger queryOneById(Integer id) {
		return bloggerDao.selectByPrimaryKey(id);
	}

	@Override
	public void modifyBlogger(Blogger blogger) {
		int i=bloggerDao.updateByPrimaryKeySelective(blogger);
		if (i<1) {
			System.out.println("blogger修改失败");
		}
	}

	@Override
	public List<Blogger> queryAll(BloggerBO bloggerBO) {
		return bloggerDao.selectAll(bloggerBO);
	}

	@Override
	public int countAll(BloggerBO bloggerBO) {
		return bloggerDao.countAll(bloggerBO);
	}

}
