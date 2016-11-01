package com.dinesh.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinesh.springdatajpa.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
