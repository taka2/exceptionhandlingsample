package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		throw new Exception("Failed to execute run method.");
	}

}
