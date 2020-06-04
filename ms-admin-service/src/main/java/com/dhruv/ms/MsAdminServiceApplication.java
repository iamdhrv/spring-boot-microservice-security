package com.dhruv.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAdminServiceApplication.class, args);
	}

}
