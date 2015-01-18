package com.example.accessmofier.Class1;

import com.example.accessmofier.Class.Bike;
import com.example.accessmofier.Class.Car;

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
