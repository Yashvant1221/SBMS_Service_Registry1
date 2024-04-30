package com.SBMS_Service_Registry.SBMS_Service_Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbmsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsServiceRegistryApplication.class, args);
	}

}
