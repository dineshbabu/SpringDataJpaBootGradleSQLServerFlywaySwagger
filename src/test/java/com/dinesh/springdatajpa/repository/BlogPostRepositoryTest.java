package com.dinesh.springdatajpa.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.dinesh.springdatajpa.entity.BlogPost;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BlogPostRepositoryTest {

	@Autowired
	BlogPostRepository blogPostRepository;
	
	@Test
	public void createBlogPost(){
		BlogPost blogPost = new BlogPost();
		blogPost.setMessage("Blog1");
		blogPost.setCreatedDate(new Date());
		blogPost.setCreatedBy("TestUser");
		blogPost = blogPostRepository.saveAndFlush(blogPost);
		blogPost = blogPostRepository.findOne(blogPost.getId());
		assertNotNull(blogPost);
		assertEquals("Blog1", blogPost.getMessage());
	}
}
