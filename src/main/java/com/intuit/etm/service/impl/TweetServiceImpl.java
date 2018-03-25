package com.intuit.etm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.etm.dao.TweetDAO;
import com.intuit.etm.service.TweetService;

/**
 * Tweet Service Implementation
 * @author supraja
 *
 */
@Service("tweetService")
public class TweetServiceImpl implements TweetService {
	
	@Autowired
	TweetDAO tweetDAO;

	public boolean tweet(Integer empId, String tweet) {
		// TODO Auto-generated method stub
		return tweetDAO.tweet(empId, tweet);
	}

}
