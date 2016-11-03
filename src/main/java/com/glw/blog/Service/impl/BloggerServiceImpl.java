package com.glw.blog.Service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.glw.blog.Service.BloggerService;
import com.glw.blog.bo.BloggerBO;
import com.glw.blog.manager.BloggerManager;
import com.glw.blog.pojo.Blogger;

public class BloggerServiceImpl implements BloggerService {

	@Autowired
	BloggerManager bloggerManager;

	@Override
	public Blogger login(BloggerBO bloggerBO) {
		List<Blogger> list = bloggerManager.queryAll(bloggerBO);
		if (list.size() > 0) {
			Blogger blogger=list.get(0);
			blogger.setLastLogin(Calendar.getInstance().getTime());
			bloggerManager.modifyBlogger(blogger);
			return blogger;
		} else {
			return null;
		}
	}

	@Override
	public void reg(Blogger blogger) {
		BloggerBO bloggerBO=new BloggerBO();
		bloggerBO.setUserName(blogger.getUserName());
		List<Blogger> list=bloggerManager.queryAll(bloggerBO);
		if (list.size() < 1) {
			bloggerManager.createBlogger(blogger);
		}
	}

	@Override
	public List<Blogger> queryByBO(BloggerBO bloggerBO) {
		return bloggerManager.queryAll(bloggerBO);
	}

	@Override
	public List<Blogger> queryAll() {
		return bloggerManager.queryAll(null);
	}

	@Override
	public void modify(Blogger blogger) {
		bloggerManager.modifyBlogger(blogger);
	}

}
