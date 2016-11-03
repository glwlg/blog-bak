package com.glw.blog.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.glw.blog.Service.BlogService;
import com.glw.blog.bo.BlogBO;
import com.glw.blog.pojo.Blog;
import com.glw.blog.pojo.Blogger;
import com.opensymphony.xwork2.ActionContext;

public class BlogAction {

	@Autowired
	BlogService blogService;

	private Blog blog;
	private BlogBO blogBO;
	private List<Blog> blogList;

	public void write() {
		Blogger blogger = (Blogger) ActionContext.getContext().getSession().get("blogger");
		blog.setBloggerId(blogger.getId());
		blogService.createBlog(blog);
	}

	public void queryAll() {
		Blogger blogger = (Blogger) ActionContext.getContext().getSession().get("blogger");
		blogBO.setBloggerId(blogger.getId());
		blogList = blogService.queryAll(blogBO);
	}

	public void remove() {
		Blogger blogger = (Blogger) ActionContext.getContext().getSession().get("blogger");
		if (blog.getBloggerId() == blogger.getId()) {
			blogService.removeBlog(blog.getId());
		}
	}

	public void modify() {
		Blogger blogger = (Blogger) ActionContext.getContext().getSession().get("blogger");
		if (blog.getBloggerId() == blogger.getId()) {
			blogService.modifyBlog(blog);
		}
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	public void setBlogBO(BlogBO blogBO) {
		this.blogBO = blogBO;
	}

	public List<Blog> getBlogList() {
		return blogList;
	}

}
