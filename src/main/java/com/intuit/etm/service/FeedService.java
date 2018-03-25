package com.intuit.etm.service;

import java.util.List;

import com.intuit.etm.vo.Feed;

/**
 * Feed Service Interface
 * @author rbonigi
 *
 */
public interface FeedService {
	List<Feed> feed(Integer empId);

}
