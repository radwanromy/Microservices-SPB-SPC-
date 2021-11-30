package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.LimitsConfiguration;
@RestController
public class LimitsConfigurationController {

	@Autowired
	private LimitsConfiguration limits; 
	@GetMapping("/limits")
	public LimitsConfiguration returnLimits() {
		return new LimitsConfiguration(limits.getMaximum(),limits.getMinimum());
	}
}
