package com.cg;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.cg.beans.Slots;

@SpringBootApplication
@EnableDiscoveryClient
public class ParkingSlotApplication {

	@Bean
	public Slots slots() {
		return new Slots();
	}
	public static void main(String[] args) {
		SpringApplication.run(ParkingSlotApplication.class, args);
	
	}

}
