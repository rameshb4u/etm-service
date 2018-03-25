package com.intuit.etm.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.intuit.etm.dao.TweetDAO;

/**
 * ETM_TWEET Table DAO Interface Implementation
 * @author rbonigi
 *
 */
@Repository("tweetDAO")
public class TweetDAOImpl implements TweetDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 * tweet method to store employee tweets
	 */
	public boolean tweet(Integer empId, String tweet) {
		System.out.println("Entered tweet Method TweetDAOImpl\n"+empId+" \n:"+tweet);
        jdbcTemplate.update("INSERT INTO ETM_TWEET (EMP_ID, TWT) VALUES (?, ?)",
        		empId, tweet);
        System.out.println("Tweet Added!!");		
		return true;
	}

}
