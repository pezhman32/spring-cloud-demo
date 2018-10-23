package com.innogames.demo.reportservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportFeignRest {

	@Autowired
	private OrganizationClient organizationClient;

	@RequestMapping("/report/feign/report-all-organizations")
	public String test() {
		return organizationClient.getTestVariable();
	}
}
