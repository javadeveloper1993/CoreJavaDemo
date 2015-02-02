package com.example.constructor;

/**
 * @author Maulik
 */
public class Constructor_Parameter {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Maruti");
		Car car3 = new Car("Van", "Black");

		System.out.println(Constructor_Parameter.class.getClassLoader());
		System.out.println(Constructor_Parameter.class.getCanonicalName());
		System.out.println(Constructor_Parameter.class.getProtectionDomain());
		System.out.println(Constructor_Parameter.class.getPackage());
	}
}

class Car {
	private String name;
	private String color;

	public Car() {
		System.out.println("This Is Default Car Constructor");
		displayCarInfo();
	}

	/**
	 * @param color
	 */
	public Car(String name) {
		this.name = name;
		displayCarInfo();
	}

	/**
	 * @param name
	 * @param color
	 */
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
		displayCarInfo();
	}

	void displayCarInfo() {
		System.out.println("Car Name >>>>> " + name + " Color >>>>> " + color);
	}
}
