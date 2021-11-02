package com.revature.repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature")
public class FrontOutRepo implements IFrontOutRepo {

	
	public FrontOutRepo() {
		super();
	}

	@Override
	public String getString() {
		return "https://giphy.com/gi";
	}

}
