package com.example.methodoverloading;

/**
 * @author Maulik
 * 
 */
public class Overloading_By_Diffrent_DataType {

	public static void main(String[] args) {

		OverloadingClass overloadingClass = new OverloadingClass();
		overloadingClass.display();
		overloadingClass.display(150);
		overloadingClass.display("This Is String...!!!");
		overloadingClass.display(10);
	}

}

class OverloadingClass {

	void display() {
		System.out.println("This is No Argument Method..!!!");
	}

	void display(int no) {
		System.out.println("This is Int Argument Method..!!! Value Is : " + no);
	}

	void display(String name) {
		System.out.println("This is String Argument Method..!!! Value Is : "
				+ name);
	}

}
