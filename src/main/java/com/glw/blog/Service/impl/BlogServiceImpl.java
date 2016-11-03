package com.glw.blog.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.glw.blog.Service.BlogService;
import com.glw.blog.bo.BlogBO;
import com.glw.blog.manager.BlogManager;
import com.glw.blog.pojo.Blog;

public class BlogServiceImpl implements BlogService{

	@Autowired
	BlogManager blogManager;
	
	@Override
	public void createBlog(Blog blog) {
		if (blog.getTitle()==null) {
			blog.setTitle(blog.getBlog().length()<11?blog.getBlog().substring(0):blog.getBlog().substring(0,10));
		}
		blogManager.createBlog(blog);
	}

	@Override
	public void removeBlog(int id) {
		blogManager.removeBlog(id);
	}

	@Override
	public void modifyBlog(Blog blog) {
		blogManager.modifyBlog(blog);
	}

	@Override
	public Blog queryOne(int id) {
		return blogManager.queryOne(id);
	}

	@Override
	public List<Blog> queryAll(BlogBO blogBO) {
		blogBO.setLimitFrom();
		return blogManager.queryAll(blogBO);
	}

}
