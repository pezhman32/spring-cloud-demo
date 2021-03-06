package com.innogames.demo.reportservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportRest {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/report/all-organizations")
	public String test() {
		return serviceUrl();
	}

	private String serviceUrl() {
		List<ServiceInstance> list = discoveryClient.getInstances("ORGANIZATION-SERVICE");
		StringBuilder sb = new StringBuilder();
		if (list != null && list.size() > 0) {
			sb.append("\n").append(
					list.get(0).getUri());
		}

		return sb.toString();
	}
}
