package com.bjs.auguest.chaius;

import java.util.Properties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.config.DynamicLongProperty;
import com.netflix.config.DynamicPropertyFactory;

@RestController
public class PropertiesChangeController {
	@RequestMapping("/getValue")
	public String getValue() {
		
		DynamicLongProperty timeToWait = DynamicPropertyFactory.getInstance().getLongProperty("lock.waitTime", 1000);
		return timeToWait.getName()+":"+timeToWait.getValue();
	}
	
}
