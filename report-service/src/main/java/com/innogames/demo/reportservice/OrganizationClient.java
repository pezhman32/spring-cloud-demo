package com.innogames.demo.reportservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import static org.springframework.http.client.MultipartBodyBuilder.PublisherEntity;

@FeignClient(name = "ORGANIZATION-SERVICE", path = "/org")
public interface OrganizationClient {

	@RequestMapping(method = RequestMethod.GET, value = "/testVariable")
	String getTestVariable();

//	@RequestMapping(method = RequestMethod.GET, value = "/{orgId}/publishers")
//	List<PublisherEntity> getPublishers(@PathVariable String orgId, @RequestParam Integer limit);
}
