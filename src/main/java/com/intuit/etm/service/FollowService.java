/**
 * 
 */
package com.intuit.etm.service;

/**
 * Follow Service Interface
 * @author rbonigi
 *
 */
public interface FollowService {
	
	boolean follow(Integer uid, Integer follower, Integer flwInd);
	
}
