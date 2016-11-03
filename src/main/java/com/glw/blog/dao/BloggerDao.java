package com.glw.blog.dao;

import java.util.List;

import com.glw.blog.bo.BloggerBO;
import com.glw.blog.pojo.Blogger;

public interface BloggerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Blogger blogger);

    int insertSelective(Blogger blogger);

    Blogger selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Blogger blogger);

    int updateByPrimaryKey(Blogger blogger);
    
    List<Blogger> selectAll(BloggerBO bloggerBO);
    
    int countAll(BloggerBO bloggerBO);
}