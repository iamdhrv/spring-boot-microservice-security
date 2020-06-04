package com.dhruv.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@GetMapping("/detail")
	public String admin() {
		return "hello, admin.";
	}
}
