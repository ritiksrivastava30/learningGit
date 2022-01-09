package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.demo2.Sample;

@SpringBootApplication
public class PracticeApplication {
//	@Autowired
//	private SpringEmail sr;
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}
	
	@Scheduled(cron="0 24 21 * * *")
	void someJob() throws InterruptedException{
		Sample obj=new Sample();
		obj.kuchBhi();
//		System.out.println("Now is "+ new Date());
		
	}
	
	
	@Configuration
	@EnableScheduling
	@ConditionalOnProperty(name="sheduling.enabled", matchIfMissing =true)
	class SchedulingConfiguration{
		
		public SchedulingConfiguration() {
		// TODO Auto-generated constructor stub
		}
	}
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendEmail() {
//		sr.sendEmail("ritik.sri30@gmail.com", "sjava ke dwara" , "This is body");
//	}

}
