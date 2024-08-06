package com.pa.test;

import com.pa.test.dao.UserRepository;
import com.pa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootpaexampleApplication {



	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user=new User();
//		user.setName("Kunal");
//		user.setCity("Mumbai");
//		user.setStatus("java programmer");
//
//		User user1 = userRepository.save(user);
//
//		System.out.println(user1);

//		User user1 = new User();
//		user1.setName("krishna");
//		user1.setCity("Nagpur");
//		user1.setStatus("Python Programmer");
//
//		User user2 = new User();
//		user2.setName("Arush");
//		user2.setCity("Nagpur");
//		user2.setStatus("C++ Programmer");
//
//		// saving single user
//		// User resultuser = userRepository.save(user2);
//
//		List<User> users = List.of(user1, user2);
//
//		//save multiple
//		Iterable<User> result = userRepository.saveAll(users);
//
//		result.forEach((user -> {
//			System.out.println(users);
//		}));
//
////		for (User user : result) {
////			System.out.println(users);
////		}
//
//		System.out.println("saved user "+result);
//		System.out.println("Done");


		// Update data

//		Optional<User> optional = userRepository.findById(53);
//		User user = optional.get();
//		user.setName("Karna");
//		User r = userRepository.save(user);

		//HOW to get the data
		// findByID(id) -- return Optional containing your data

//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//
//		while(iterator.hasNext()) {
//			User user=iterator.next();
//			System.out.println(user);
//		}


//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//				System.out.println(user);
//			}
//		});


//		itr.forEach((user -> System.out.println(user)));


		//Deleting the user
//		userRepository.deleteById(53);
//		System.out.println("Deleted : ");

		Iterable<User> allusers = userRepository.findAll();
		allusers.forEach(user -> System.out.println(user));
		userRepository.deleteAll(allusers);
	}


}
