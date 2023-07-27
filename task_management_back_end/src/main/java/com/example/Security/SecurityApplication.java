package com.example.Security;

import com.example.Security.model.Role;
import com.example.Security.model.User;
import com.example.Security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;

@SpringBootApplication
@EnableWebSecurity
@EnableJpaRepositories
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
//	@Bean
//	BCryptPasswordEncoder brBCryptPasswordEncoder(){
//		return new BCryptPasswordEncoder();
//	}
//	@Bean
//	CommandLineRunner run(UserService userService){
//		return args -> {
//			userService.saveRole(new Role(null,"ROLE_USER","this is user","default","default"));
//			userService.saveUser(new User("9876543211","akash","akashkolte240899@gmail.com","pass",new HashSet<>(),"default","default"));
//			userService.addToUser("akashkolte240899@gmail.com","ROLE_USER");
//			userService.addToUser("akashkolte240899@gmail.com","ROLE_SUPER_ADMIN");
//
//		};
//	}
}
