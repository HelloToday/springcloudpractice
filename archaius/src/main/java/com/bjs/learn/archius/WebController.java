package com.bjs.learn.archius;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.config.DynamicLongProperty;
import com.netflix.config.DynamicPropertyFactory;

@RestController
@RequestMapping("test")
public class WebController {
	@RequestMapping("getValue")
	public String getConfigValueBykey() {
		 DynamicLongProperty timeToWait = DynamicPropertyFactory.getInstance().getLongProperty("lock.waitTime", 1000);
		return timeToWait.getValue()+"";
	}
}
