package com.glw.blog.Service;

import java.util.List;

import com.glw.blog.bo.BlogBO;
import com.glw.blog.pojo.Blog;

public interface BlogService {

	public void createBlog(Blog blog);

	public void removeBlog(int id);

	public void modifyBlog(Blog blog);

	public Blog queryOne(int id);

	public List<Blog> queryAll(BlogBO blogBO);
}
