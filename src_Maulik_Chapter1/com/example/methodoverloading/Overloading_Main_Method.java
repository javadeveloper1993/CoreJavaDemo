package com.example.methodoverloading;

/**
 * @author Maulik
 * 
 */
public class Overloading_Main_Method {

	public static void main(String[] args) {
		System.out.println("This Is Main Method...!!!");
		main();
		main(5);
	}

	public static void main() {
		System.out.println("This Is Not Main Method...!!!");
	}

	public static void main(int no) {
		System.out
				.println("This Is Another Main Method...!!! && No is : " + no);
	}
}
