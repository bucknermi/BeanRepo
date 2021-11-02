package com.revature.repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature")
public class BackInRepo implements IBackInRepo {

	
	
	public BackInRepo() {
		super();
	}

	@Override
	public String getString() {
		return "osebumps-walkaway-3ornkf4";
	}

}
