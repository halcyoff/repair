package com.houstoncounty.repair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RepairApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RepairApplication.class, args);
	}
}
