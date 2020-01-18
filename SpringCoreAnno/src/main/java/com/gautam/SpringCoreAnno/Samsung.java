package com.gautam.SpringCoreAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	Microprocessor mp;
	
	public Microprocessor getMp() {
		return mp;
	}

	public void setMp(Microprocessor mp) {
		this.mp = mp;
	}

	public void config() {

		System.out.println("Octa core, 6 GB RAM,48MP Camera");
		mp.process();
	}

}
