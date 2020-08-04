package com.example.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ParkingSlotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingSlotApplication.class, args);
	}

}
