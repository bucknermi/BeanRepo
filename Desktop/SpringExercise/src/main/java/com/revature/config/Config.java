package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.revature.repositories.BackInRepo;
import com.revature.repositories.BackOutRepo;
import com.revature.repositories.FrontInRepo;
import com.revature.repositories.FrontOutRepo;
import com.revature.services.InnerService;
import com.revature.services.OuterService;


public class Config {
	
	@Bean(name="InnerService") 
	@Scope("prototype")
	public InnerService getInnerService(){
		return new InnerService(getFrontInRepo(), getBackInRepo());
		
	}
	
	@Bean(name="OuterService") 
	@Scope("prototype")
	public OuterService getOuterService(){
		return new OuterService(getFrontOutRepo(), getBackOutRepo());
		
	}
	
	@Bean(name="BackInRepo")
	public BackInRepo getBackInRepo() {
		return new BackInRepo();
	}
	
	@Bean(name="FrontInRepo")
	public FrontInRepo getFrontInRepo() {
		return new FrontInRepo();
	}
	
	@Bean(name="BackOutRepo")
	public BackOutRepo getBackOutRepo() {
		return new BackOutRepo();
	}
	
	@Bean(name="FrontOutRepo")
	public FrontOutRepo getFrontOutRepo() {
		return new FrontOutRepo();
	}

}
