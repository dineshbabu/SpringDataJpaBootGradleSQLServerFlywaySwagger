package com.dinesh.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinesh.springdatajpa.entity.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

}
