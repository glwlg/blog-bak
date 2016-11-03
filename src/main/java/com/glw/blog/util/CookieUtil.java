package com.glw.blog.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;


public class CookieUtil {
	
	private HttpServletResponse response;
	public CookieUtil(HttpServletResponse response) {
		this.response=response;
	}

	public void setCookie(String name, String value) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(1000);
		response.addCookie(cookie);
	}
}
