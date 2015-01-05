package com.example.methodoverloading;

/**
 * @author Maulik
 * 
 */
public class Overloading_By_Diffrent_ArgumentList {

	public static void main(String[] args) {

		Overloading_Diffrent_Argument overloadingClass = new Overloading_Diffrent_Argument();
		overloadingClass.display();
		overloadingClass.display(150, 15.65);
		overloadingClass.display("This Is String");
	}
}

class Overloading_Diffrent_Argument {

	void display() {
		System.out.println("This is No Argument Method..!!!");
	}

	void display(int no, double doubleValue) {
		System.out.println("This is Int Argument Method..!!! Value Is >>> "
				+ no + " Double Value >>>>  " + doubleValue);
	}

	void display(String name) {
		System.out.println("This is String Argument Method..!!! Value Is >>> "
				+ name);

		System.out.println();
	}

}
