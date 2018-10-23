package com.innogames.demo.organizationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class OrgRest {

	@Value("${ig.cake-name}")
	private String cakeForInnoGamers;

	@RequestMapping("/org/testVariable")
	public String getTestVariable() {
		System.out.println(cakeForInnoGamers);
		return cakeForInnoGamers;
	}
}
