package com.concretepage;
import org.springframework.cache.annotation.Cacheable;
public class Employee {
	@Cacheable("empcache") 
	public String getEmployee(int empId){
		System.out.println("---Inside getEmployee() Method---");
		if(empId==1){			
			return "Shankar";
		}else{
			return "Vishnu";
		}
	}
}