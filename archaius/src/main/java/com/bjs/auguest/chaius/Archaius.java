package com.bjs.auguest.chaius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Archaius {

	public static void main(String[] args) {
		/*
		 * 修改系统的变量值
		 * 让系统以非默认的方式运行
		 * 1.可以这样显示的设置系统变量
		 * 2.也可以直接在运行的时候通过Java 命令行设置应用的系统变量系统变量
		 * 3.也可以直接修改操作系统的系统变量
		 */
		System.setProperty("archaius.configurationSource.defaultFileName", "fuck.properties");
		System.setProperty("archaius.fixedDelayPollingScheduler.initialDelayMills", "100");
		System.setProperty("archaius.fixedDelayPollingScheduler.delayMills", "100");
		
		SpringApplication.run(Archaius.class, args);
	}
}
