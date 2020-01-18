package com.gautam.SpringCoreAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Intel implements Microprocessor {

	public void process() {
		System.out.println("Intel Processor");
	}

}
