package com.gautam.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

//This program is to understand how to 
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Tyre obj = (Tyre) context.getBean("tyre");
		System.out.println(obj);

	}
}
