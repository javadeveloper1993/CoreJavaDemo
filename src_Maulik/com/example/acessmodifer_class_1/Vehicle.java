package com.example.acessmodifer_class_1;

import com.example.acessmodifer_class.Bike;
import com.example.acessmodifer_class.Car;

/**
 * @author Maulik
 * 
 */
public class Vehicle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Bike Class Is Declare As Public as well as this class is declare in
		 * diffrent package that's Why Compilation error is generate
		 */
		Bike bike = new Bike();
		bike.name();
		Car car = new Car();
		car.name();
	}
}
