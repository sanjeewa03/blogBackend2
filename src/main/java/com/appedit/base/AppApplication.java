package com.appedit.base;

import com.appedit.base.models.User;
import com.appedit.base.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();

		User isCreated = userRepository.save(new User("sanjeewa","sanjeewa","admin"));
		System.out.println(isCreated);
	}
}
