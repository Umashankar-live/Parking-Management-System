package com.cg;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.cg.beans.Slots;

@SpringBootApplication
@EnableEurekaClient
public class ParkingSlotApplication {
	
	@Bean
	public Slots getslots() {
		return new Slots();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ParkingSlotApplication.class, args);
	
	}

}
