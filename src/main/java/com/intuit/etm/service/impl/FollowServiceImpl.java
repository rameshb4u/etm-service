package com.intuit.etm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.etm.dao.FollowDAO;
import com.intuit.etm.service.FollowService;

/**
 * Follow Service Implementation
 * @author rbonigi
 *
 */
@Service("followService")
public class FollowServiceImpl implements FollowService {
	
	@Autowired
	FollowDAO followDAO;

	public boolean follow(Integer empId, Integer flwId, Integer flwInd) {
		// TODO Auto-generated method stub
		return followDAO.follow(empId, flwId, flwInd);
	}


}
