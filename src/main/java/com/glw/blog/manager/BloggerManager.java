package com.glw.blog.manager;

import java.util.List;

import com.glw.blog.bo.BloggerBO;
import com.glw.blog.pojo.Blogger;

public interface BloggerManager {

	public void createBlogger(Blogger blogger);

	public Blogger queryOneById(Integer id);

	public void modifyBlogger(Blogger blogger);

	public List<Blogger> queryAll(BloggerBO bloggerBO);
	
	public int countAll(BloggerBO bloggerBO);
}
