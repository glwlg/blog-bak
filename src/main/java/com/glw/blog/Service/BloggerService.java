package com.glw.blog.Service;

import java.util.List;

import com.glw.blog.bo.BloggerBO;
import com.glw.blog.pojo.Blogger;

public interface BloggerService {

	public Blogger login(BloggerBO bloggerBO);

	public void reg(Blogger blogger);

	public List<Blogger> queryByBO(BloggerBO bloggerBO);

	public List<Blogger> queryAll();

	public void modify(Blogger blogger);
}
