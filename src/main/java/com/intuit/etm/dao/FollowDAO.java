package com.intuit.etm.dao;

/**
 * ETM_FOLLOW Table DAO Interface
 * @author rbonigi
 *
 */
public interface FollowDAO {
	
	boolean follow(Integer empId, Integer flwId, Integer flwInd);

}
