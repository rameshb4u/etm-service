package com.intuit.etm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.etm.service.FeedService;

import com.intuit.etm.vo.Feed;
import java.util.List;

/**
 * FeedController rest service handles tweet information for the users.
 * @author rbonigi
 *
 */

@RestController
@RequestMapping("/etm/feed/")
public class FeedController {
	@Autowired
	FeedService feedService;
	
	/**
	 * feed method returns all the feeds for the employee
	 * @param empId
	 * @return
	 */
	@RequestMapping(value="/{empId}",method=RequestMethod.GET)
	public List<Feed> feed(@PathVariable Integer empId) {	
		if(empId==null) {
			throw new IllegalArgumentException("Invlaid Employee Data!!");
		}
		return feedService.feed(empId);
	}


}
