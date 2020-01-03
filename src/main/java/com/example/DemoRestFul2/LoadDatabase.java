package com.example.DemoRestFul2;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {
@Bean

CommandLineRunner initDatabase(EmployeeRepository repository) {
	return args->{
		LoggerFactory.getLogger("Preloading: "+ repository.save(new Employee("Bilbo Baggins", "burglar")));
		LoggerFactory.getLogger("Preloading: "+ repository.save(new Employee("Frodo Baggins", "thief")));
	};
}
}
