package com.intuit.etm.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.intuit.etm.dao.FollowDAO;

/**
 * ETM_FOLLOW Table DAO Interface Implementation 
 * @author rbonigi
 *
 */
@Repository("followDAO")
public class FollowDAOImpl implements FollowDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * follow method updates ETM_FOLLOWER table to set employee with its followers 
	 */
	public boolean follow(Integer empId, Integer flwId,  Integer flwInd) {
		System.out.println("Follow Object ********"+empId+" , "+flwId+" , "+flwInd);
		
        Map<String, Integer> parameters = new HashMap<String, Integer>();
        parameters.put("empId", empId);
        parameters.put("flwId", flwId);
        parameters.put("flwInd", flwInd);
        
        Integer ind = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM ETM_FOLLOWER WHERE EMP_ID=? AND FLW_ID=?", Integer.class, empId,flwId);
		
        System.out.println("Number of Records::"+ind);
        
		String sql ="";
		if(ind==0) {
	        sql="INSERT IGNORE INTO ETM_FOLLOWER (EMP_ID, FLW_ID, FLW_IND) VALUES (?,?,?) ";
	        jdbcTemplate.update(sql, empId,flwId,flwInd);
		}
		else {
			sql="UPDATE ETM_FOLLOWER SET EMP_ID=?, FLW_ID=?, FLW_IND=? WHERE EMP_ID=? AND FLW_ID=?";
			 jdbcTemplate.update(sql, empId,flwId,flwInd, empId,flwId);
		}
		 
        return true;
	}
}
