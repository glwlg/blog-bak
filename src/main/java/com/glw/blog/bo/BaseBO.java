package com.glw.blog.bo;

public class BaseBO {

	private Integer page=1;
	private Integer pageSize=20;
	private Integer count;
	private Integer limitFrom;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getLimitFrom() {
		return limitFrom;
	}
	public void setLimitFrom() {
		this.limitFrom = (this.page-1)*this.pageSize;
	}
	
}
