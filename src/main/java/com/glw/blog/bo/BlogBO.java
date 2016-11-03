package com.glw.blog.bo;

import java.util.Date;

public class BlogBO extends BaseBO{

	private String title;
	private Integer bloggerId;
	private Date blogDateFrom;
	private Date blogDateEnd;
	private Integer orderByRead;
	private Integer orderByUp;
	private Integer orderByDate;
	private Integer type;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getBloggerId() {
		return bloggerId;
	}
	public void setBloggerId(Integer bloggerId) {
		this.bloggerId = bloggerId;
	}
	public Date getBlogDateFrom() {
		return blogDateFrom;
	}
	public void setBlogDateFrom(Date blogDateFrom) {
		this.blogDateFrom = blogDateFrom;
	}
	public Date getBlogDateEnd() {
		return blogDateEnd;
	}
	public void setBlogDateEnd(Date blogDateEnd) {
		this.blogDateEnd = blogDateEnd;
	}
	public Integer getOrderByRead() {
		return orderByRead;
	}
	public void setOrderByRead(Integer orderByRead) {
		this.orderByRead = orderByRead;
	}
	public Integer getOrderByUp() {
		return orderByUp;
	}
	public void setOrderByUp(Integer orderByUp) {
		this.orderByUp = orderByUp;
	}
	public Integer getOrderByDate() {
		return orderByDate;
	}
	public void setOrderByDate(Integer orderByDate) {
		this.orderByDate = orderByDate;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}
