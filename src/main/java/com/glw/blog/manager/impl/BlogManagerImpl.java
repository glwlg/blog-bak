package com.glw.blog.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.glw.blog.bo.BlogBO;
import com.glw.blog.dao.BlogDao;
import com.glw.blog.manager.BlogManager;
import com.glw.blog.pojo.Blog;

public class BlogManagerImpl implements BlogManager{

	@Autowired
	BlogDao blogDao;
	
	@Override
	public void removeBlog(int id) {
		int i=blogDao.deleteByPrimaryKey(id);
		if (i<1) {
			System.out.println("blog删除失败");
		}
	}

	@Override
	public void createBlog(Blog blog) {
		int i=blogDao.insertSelective(blog);
		if (i<1) {
			System.out.println("blog添加失败");
		}
	}

	@Override
	public Blog queryOne(int id) {
		return blogDao.selectByPrimaryKey(id);
	}

	@Override
	public void modifyBlog(Blog blog) {
		int i=blogDao.updateByPrimaryKeySelective(blog);
		if (i<1) {
			System.out.println("blog修改失败");
		}
	}


	@Override
	public List<Blog> queryAll(BlogBO blogBO) {
		return blogDao.selectAll(blogBO);
	}

	@Override
	public int countAll(BlogBO blogBO) {
		return blogDao.countAll(blogBO);
	}


}
