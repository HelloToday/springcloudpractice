package com.bjs.auguest.jmx;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.Notification;
import javax.management.NotificationListener;
import javax.management.ObjectName;

import com.sun.jdmk.comm.HtmlAdaptorServer;

public class HelloAgent implements NotificationListener{
	 private MBeanServer mbs;

	    public HelloAgent() {
	        this.mbs = MBeanServerFactory.createMBeanServer("HelloAgent");

	        HelloWorld hw = new HelloWorld();
	        ObjectName helloWorldName = null;
	        try{
	            helloWorldName = new ObjectName("HelloAgent:name=helloWorld");
	            mbs.registerMBean(hw, helloWorldName);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        startHtmlAdaptorServer();
	    }

	    public void startHtmlAdaptorServer(){
	        HtmlAdaptorServer htmlAdaptorServer = new HtmlAdaptorServer();
	        ObjectName adapterName = null;
	        try {
	            adapterName = new ObjectName("HelloAgent:name=htmladapter,port=9092");
	            htmlAdaptorServer.setPort(9092);
	            mbs.registerMBean(htmlAdaptorServer, adapterName);
	            htmlAdaptorServer.start();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static void main(String args[]){
	        System.out.println(" hello agent is running");
	        HelloAgent agent = new HelloAgent();
	    }

		@Override
		public void handleNotification(Notification notification, Object handback) {
			
		}
}
