package com.concretepage;
import org.springframework.cache.ehcache.EhCacheCache;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringDemo {
    public static void main(String... args) {
    	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
  	     ctx.register(AppConfig.class);
  	     ctx.refresh();
         Employee employee=(Employee) ctx.getBean(Employee.class);
         Greetings greetings=(Greetings) ctx.getBean(Greetings.class);
            
        /* //calling getEmployee method first time.
         System.out.println("---Fetch Employee with id 1---");
         System.out.println("Employee:"+ employee.getEmployee(1));
            
         //calling getEmployee method second time. This time, method will not execute.
         System.out.println("---Again Fetch Employee with id 1, result will be fetched from cache---");
         System.out.println("Employee:"+employee.getEmployee(1));
            
         //calling getEmployee method third time with different value.
         System.out.println("---Fetch Employee with id 2---");
         System.out.println("Employee:"+employee.getEmployee(2));
          
         System.out.println("---Fetch greeting with name XXX---");
         System.out.println("Employee:"+ greetings.getGreetings("XXX"));
            
         //calling getEmployee method second time. This time, method will not execute.
         System.out.println("---Again Fetch Employee with id 1, result will be fetched from cache---");
         System.out.println("Employee:"+employee.getEmployee(1));*/
            
         System.out.println("---Fetch greeting with name XXX ------");         
         System.out.println("REPLY:"+ greetings.getGreetings("XXXXX"));
         try{
        	 System.out.println("---Fetch greeting with name XXX , result will be fetched from cache---");
             System.out.println("REPLY:"+ greetings.getGreetings("XXXXX"));
         }catch(Exception ee)
         {
        	 
         }
         /*System.out.println("---Fetch greeting with name YYY ---");
         System.out.println("REPLY:"+ greetings.getGreetings("YYY"));
         System.out.println("---Fetch greeting with name YYY , result will be fetched from cache---");
         System.out.println("REPLY:"+ greetings.getGreetings("YYY"));*/
          
     } 
}