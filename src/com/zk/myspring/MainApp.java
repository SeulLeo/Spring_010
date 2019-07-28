package com.zk.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]args)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		foo f1=(foo) ac.getBean("foo1");
	}
}
