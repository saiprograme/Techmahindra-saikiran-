package com.samples.appexample.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class SpringBootRunnerWithInputData implements CommandLineRunner {
	
	@Value("${my.info.student.id}")
	private int stuid;
	
	@Value("${my.info.student.name}")
	private String stuName;
	
	@Value("${my.info.student.class}")
	private String stuClass;
	
	
	//instead of setter getter methods
	//let us print using toString
	@Override
	public String toString() {
		return "SpringBootRunnerWithInputData [stuid=" + stuid + ",stuName=" + stuName + ",stuClass=" + stuClass + "]";
	}
	
	//override the run method
	public void run(String...args) throws Exception {
		System.out.println(this);
	}
	
	


}
