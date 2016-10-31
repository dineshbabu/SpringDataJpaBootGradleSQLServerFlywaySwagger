package com.dinesh.springdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.springdatajpa.entity.BlogPost;
import com.dinesh.springdatajpa.repository.BlogPostRepository;

@Service
public class BlogPostService {

	@Autowired
	private BlogPostRepository blogPostRepository;
	
	public BlogPost createPost(BlogPost blogPost){
		return blogPostRepository.saveAndFlush(blogPost);
	}
}
