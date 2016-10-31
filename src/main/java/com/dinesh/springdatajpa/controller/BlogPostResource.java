package com.dinesh.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.springdatajpa.entity.BlogPost;
import com.dinesh.springdatajpa.service.BlogPostService;

@RestController
@RequestMapping("/post")
public class BlogPostResource {

	@Autowired
	BlogPostService postService;
  
//  @RequestMapping(value = "/{roomId}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
//  public ResponseEntity<String> getRoom(@PathVariable("roomId") int roomId) {
//	  System.out.println("getRoom called");
//	  String status  = "";
//	  try{
//		  	RoomModel room = roomService.getRoom(roomId);
//		  	status = "Success";
//		  	return new Envelope(status, room);		
//		} catch(Exception e){
//			e.printStackTrace();
//			status = "Failed";
//			return new Envelope(status, e.getMessage());
//		}
//  }
  
//  @Transactional("org.springframework.orm.jpa.JpaTransactionManager")
  @RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
  public void createPost(@RequestBody BlogPost post) {
	  postService.createPost(post);	  
  }

  
}