package com.intuit.etm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.etm.dao.FeedDAO;
import com.intuit.etm.service.FeedService;
import com.intuit.etm.vo.Feed;

/**
 * Feed Service Implementation
 * @author rbonigi
 *
 */
@Service("feedService")
public class FeedServiceImpl implements FeedService {
	
	@Autowired
	FeedDAO feedDAO;
	

	public List<Feed> feed(Integer empId) {
		return feedDAO.feed(empId);
	}

}
