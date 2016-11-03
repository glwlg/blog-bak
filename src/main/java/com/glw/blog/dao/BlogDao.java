package com.glw.blog.dao;

import java.util.List;

import com.glw.blog.bo.BlogBO;
import com.glw.blog.pojo.Blog;

public interface BlogDao {
    int deleteByPrimaryKey(int id);

    int insert(Blog blog);

    int insertSelective(Blog blog);

    Blog selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(Blog blog);

    int updateByPrimaryKey(Blog blog);
    
    List<Blog> selectAll(BlogBO blogBO);
    
    int countAll(BlogBO blogBO);
}