package com.glw.blog.dao;

import java.util.List;

import com.glw.blog.bo.PhotoBO;
import com.glw.blog.pojo.Photo;

public interface PhotoDao {

	int deleteById(int id);
	
	int insert(Photo photo);
	
	Photo selectById(int id);
	
	List<Photo> selectAll(PhotoBO photoBO);
	
	int countAll(PhotoBO photoBO);
	
	int updateById(Photo photo);
}
