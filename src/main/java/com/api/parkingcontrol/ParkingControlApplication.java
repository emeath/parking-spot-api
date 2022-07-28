package com.api.parkingcontrol;

import java.io.FileNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(ParkingControlApplication.class, args);
	}
	
}
