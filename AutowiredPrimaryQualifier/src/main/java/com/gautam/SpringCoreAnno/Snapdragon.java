package com.gautam.SpringCoreAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Microprocessor{
	
	public void process() {
		
		System.out.println("World's Best CPU");
	}

}
