package com.intuit.etm.dao;

/**
 * ETM_TWEET Table DAO Interface
 * @author rbonigi
 *
 */
public interface TweetDAO {

	boolean tweet(Integer empId, String tweet);

}
