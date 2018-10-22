package com.innogames.demo.reportservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportRest {

	@RequestMapping("/test-report")
	public String test() {
		return "Sample report";
	}
}
