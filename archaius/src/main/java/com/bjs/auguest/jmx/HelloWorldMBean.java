package com.bjs.auguest.jmx;

public interface HelloWorldMBean {
	String getGreeting();

	void setGreeting(String greeting);

	void printGreeting();
}
