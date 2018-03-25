package com.intuit.etm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.etm.service.FollowService;

/**
 * FollowController Rest Service allows to set employees to follow other employees
 * @author rbonigi
 *
 */
@RestController
@RequestMapping("/etm/follow/")
public class FollowController {
	
	@Autowired
	FollowService followService;
	
	/**
	 * 
	 * @param emp
	 * @return
	 */
	@RequestMapping(value="/flw/{empId}/{flwrId}/{flwInd}",method=RequestMethod.POST)
	public String follow(@PathVariable Integer empId, @PathVariable Integer flwrId, @PathVariable Integer flwInd) {
		
		if(empId==null || flwrId==null || flwInd==null) {
			throw new IllegalArgumentException("Invlaid Employee Data!!");
		}
		
		if(empId.intValue()==flwrId.intValue()) {
			throw new IllegalArgumentException ("Employee Cann't follow themseveles!!");
		}
		
		followService.follow(empId, flwrId, flwInd);
		return "Follow Completed";	
	}

}
