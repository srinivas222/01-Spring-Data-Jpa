package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.ContactsMastersEntity;
import com.example.demo.repository.ContactsMasterRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		ContactsMasterRepository cmr = ctx.getBean(ContactsMasterRepository.class);
		//System.out.println(cmr.getClass().getName());
		ContactsMastersEntity entity = new ContactsMastersEntity();
		entity.setContactId(101);
		entity.setContactName("Srinivas");
		entity.setContactNumber(54154515l);
		cmr.save(entity);
		
		
	}

}
