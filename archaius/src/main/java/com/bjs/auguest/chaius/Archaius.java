package com.bjs.auguest.chaius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Archaius {

	public static void main(String[] args) {
		 System.setProperty("archaius.configurationSource.defaultFileName", "fuck.properties");
		 System.setProperty("archaius.fixedDelayPollingScheduler.initialDelayMills", "100");
		 System.setProperty("archaius.fixedDelayPollingScheduler.delayMills", "100");
		SpringApplication.run(Archaius.class, args);
	}
}
