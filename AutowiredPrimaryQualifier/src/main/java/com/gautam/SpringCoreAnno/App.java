package com.gautam.SpringCoreAnno;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(config.class);

		Samsung sam = factory.getBean(Samsung.class);
		
		sam.config();
	}
}
