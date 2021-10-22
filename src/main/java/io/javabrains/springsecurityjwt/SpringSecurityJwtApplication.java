package io.javabrains.springsecurityjwt;

import io.javabrains.springsecurityjwt.entities.UserEntity;
import io.javabrains.springsecurityjwt.repository.UserEntityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserEntityRepository userRepository) {
		return (args) -> {
			userRepository.save(new UserEntity("admin","admin"));
		};
	}

}
