package com.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Small {

	@GetMapping(value="/getBlock")
	public String getBlock() {
		return "Jenkins Project";
	}
}
