package com.api.parkingcontrol;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(ParkingControlApplication.class, args);
	}
	
	@GetMapping("/pizza")
	public String indexxxxxx() {
		
		File file = new File("src/main/resources/summer.txt");
		Scanner scanner;
		String dataText = "";
		try {
			scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				dataText += scanner.nextLine();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return dataText;
	}

}
