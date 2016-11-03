package com.glw.blog.manager;

import java.util.List;

import com.glw.blog.bo.BlogBO;
import com.glw.blog.pojo.Blog;

public interface BlogManager {
	public void removeBlog(int id);

	public void createBlog(Blog blog);

	public Blog queryOne(int id);

	public void modifyBlog(Blog blog);

	public List<Blog> queryAll(BlogBO blogBO);

	public int countAll(BlogBO blogBO);
}
