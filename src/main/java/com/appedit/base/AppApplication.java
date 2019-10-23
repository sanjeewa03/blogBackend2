package com.appedit.base;

import com.appedit.base.models.Role;
import com.appedit.base.models.User;
import com.appedit.base.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		User sanjeewa=new User();
		sanjeewa.setUsername("sanjeewa");
		sanjeewa.setPassword(passwordEncoder.encode("sanjeewa"));
		sanjeewa.grantAuthority(Role.ROLE_ADMIN);
		User isCreated = userRepository.save(sanjeewa);
		System.out.println(isCreated);
	}
}
