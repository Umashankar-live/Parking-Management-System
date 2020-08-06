package com.example.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.application.beans.Parking;
import com.example.application.beans.Slots;

@SpringBootApplication
@EnableDiscoveryClient
public class ParkingSlotApplication {
	
	@Bean
	public Slots getslots() {
		return new Slots();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ParkingSlotApplication.class, args);
	
	}

}
