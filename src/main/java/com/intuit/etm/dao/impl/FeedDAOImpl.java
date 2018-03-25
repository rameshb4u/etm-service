package com.intuit.etm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.intuit.etm.dao.FeedDAO;
import com.intuit.etm.vo.Feed;

/**
 * FeedDAO Interface Implementation to get all the tweets by employee Id
 * @author rbonigi
 *
 */
@Repository("feedDAO`")
public class FeedDAOImpl implements FeedDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * Get all the feed by employee id
	 */
	public List<Feed> feed(Integer empId) {
		// TODO Auto-generated method stub
		String sql = "SELECT  ET.TWT_ID, ET.EMP_ID, EE.EMP_FNM, EE.EMP_LNM, ET.TWT , ET.CRT_TS FROM ETM_TWEET ET, ETM_EMPLOYEE EE WHERE ET.EMP_ID=EE.EMP_ID AND ET.EMP_ID IN (\n" + 
				"\n" + 
				"SELECT EMP_ID FROM ETM_FOLLOWER WHERE FLW_ID="+empId+" AND FLW_IND =1) ORDER BY CRT_TS DESC LIMIT 0, 100";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Feed.class));
	}

}
