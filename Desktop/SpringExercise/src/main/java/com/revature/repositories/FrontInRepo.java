package com.revature.repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature")
public class FrontInRepo implements IFrontInRepo {

	public FrontInRepo() {
		super();
	}

	@Override
	public String getString() {
		return "fs/new-girl-new-girl-go";
	}

}
