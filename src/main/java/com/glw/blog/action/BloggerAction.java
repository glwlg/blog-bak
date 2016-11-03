package com.glw.blog.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.glw.blog.Service.BloggerService;
import com.glw.blog.bo.BloggerBO;
import com.glw.blog.pojo.Blogger;
import com.glw.blog.util.CookieUtil;
import com.opensymphony.xwork2.ActionContext;

public class BloggerAction {

	@Autowired
	BloggerService bloggerService;

	private BloggerBO bloggerBO;
	private Blogger blogger;

	public String login() {
		blogger = bloggerService.login(bloggerBO);
		if (blogger != null) {
			ActionContext.getContext().getSession().put("blogger", blogger);
			CookieUtil cookieUtil=new CookieUtil(ServletActionContext.getResponse());
			cookieUtil.setCookie("userName", blogger.getUserName());
			cookieUtil.setCookie("password", blogger.getPassword());
			cookieUtil.setCookie("isLogin", "1");
			return "login";
		}
		return "loginfailed";
	}
	public String loginOut(){
		ActionContext.getContext().getSession().remove("blogger");
		CookieUtil cookieUtil=new CookieUtil(ServletActionContext.getResponse());
		cookieUtil.setCookie("password", "");
		cookieUtil.setCookie("isLogin", "0");
		return "loginOut";
	}

	public String reg() {
		bloggerService.reg(blogger);
		return "reg";
	}


}
