package com.api.parkingcontrol.models;

import javax.persistence.Column;

public class CarModel {
	// colocar aqui o relacionamento jpa de parking spot com o carro
	@Column(nullable = false, unique = true, length = 7)
	private String licensePlateCar;
	
	@Column(nullable = false, length = 70)
	private String brandCar;
	
	@Column(nullable = false, length = 70)
	private String modelCar;
	
	@Column(nullable = false, length = 30)
	private String colorCar;
}
