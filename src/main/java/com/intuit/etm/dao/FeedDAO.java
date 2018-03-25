/**
 * 
 */
package com.intuit.etm.dao;

import java.util.List;

import com.intuit.etm.vo.Feed;

/**
 * FeedDAO Interface to get all the tweets by employee Id
 * @author rbonigi
 *
 */
public interface FeedDAO {
	List<Feed> feed(Integer empId);
}
