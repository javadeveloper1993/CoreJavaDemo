package com.example.constructor;

/**
 * @author Maulik
 */
public class Constructor_Copy {
	public static void main(String[] args) {
		CarDemo carDemo = new CarDemo("Van", "Black");
		CarDemo carDemo1 = new CarDemo("BMW", "red");
		CarDemo carDemo3 = new CarDemo(carDemo);
		carDemo3.name = carDemo1.name;
		carDemo3.color = carDemo1.color;
		carDemo3.displayCarDemoInfo();
	}
}

class CarDemo {

	String name;
	String color;

	/**
	 * @param name
	 * @param color
	 */
	public CarDemo(String name, String color) {
		this();
		this.name = name;
		this.color = color;
		displayCarDemoInfo();
	}

	public CarDemo(CarDemo carDemo1) {
		this();
		this.name = carDemo1.name;
		this.color = carDemo1.color;
		displayCarDemoInfo();
	}

	public CarDemo() {
		System.out.println("This is No Argument Constructor.");
	}

	void displayCarDemoInfo() {
		System.out.println("CarDemo Name >>>>> " + name + " Color >>>>> "
				+ color);
	}
}
