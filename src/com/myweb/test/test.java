package com.myweb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myweb.model.User;

public class test {

	public static void main(String[] args) {
		ApplicationContext ac =new ClassPathXmlApplicationContext
				("applicationContext.xml");
		User user = (User) ac.getBean("aa");
//		user.method();
	}
}
