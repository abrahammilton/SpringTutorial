package com.aby.spring.tutorials.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {

	@Value("${external.service.url}")
	private String url;
	
	public String returnURL() {
		return url;
	}
}
