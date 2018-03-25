package com.intuit.etm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.etm.service.TweetService;

/**
 * TweetController Rest Service to post the tweets by an employee
 * @author rbonigi
 *
 */
@RestController
@RequestMapping("/etm/tweet/")
public class TweetController {
	
	@Autowired
	TweetService tweetService;
	
	@RequestMapping(value="/{empId}",method=RequestMethod.POST)
	public String tweet(@PathVariable Integer empId, @RequestBody String tweet) {
		if(empId==null || (tweet!=null && tweet.isEmpty())) {
			throw new IllegalArgumentException("Invlaid Employee Data!!");
		}
		
		tweetService.tweet(empId, tweet);
		return "Tweet Created!!";	
	}


}
