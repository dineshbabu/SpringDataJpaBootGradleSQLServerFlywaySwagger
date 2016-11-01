package com.dinesh.springdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.springdatajpa.entity.Tag;
import com.dinesh.springdatajpa.repository.TagRepository;

@Service
public class TagService {
	
	@Autowired
	private TagRepository tagJpaRepository;

	public void createTag(Tag tag){
		tagJpaRepository.saveAndFlush(tag);
	}
	
}
