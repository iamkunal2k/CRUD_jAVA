package com.pa.test;

import com.pa.test.dao.UserRepository;
import com.pa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootpaexampleApplication {



	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		User user=new User();
		user.setName("Kunal");
		user.setCity("Mumbai");
		user.setStatus("java programmer");

		User user1 = userRepository.save(user);

		System.out.println(user1);
	}

}
