package com.intuit.etm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author rbonigi
 *
 */
@RestController
@RequestMapping("/etm")
public class EtmController {
	
	@RequestMapping
	@ResponseBody
	public String getApp() {
		return "Employee Twitter Management!!";
	}

}
