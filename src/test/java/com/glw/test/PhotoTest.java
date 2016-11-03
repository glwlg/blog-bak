package com.glw.test;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.glw.blog.dao.PhotoDao;
import com.glw.blog.pojo.Photo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class PhotoTest {

	@Autowired
	private PhotoDao photoDao = null;

	@Test
	public void test() throws IOException {
		Photo p = new Photo();
		p.setType(1);
		p.setPhotoName("fdffd");
		photoDao.insert(p);
	}
}
