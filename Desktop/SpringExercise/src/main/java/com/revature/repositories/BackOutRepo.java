package com.revature.repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature")
public class BackOutRepo implements IBackOutRepo {

	
	
	public BackOutRepo() {
		super();
	}

	@Override
	public String getString() {
		return "SAQutQCpLgc/fullscreen";
	}

}
