package com.example.constructor;

/**
 * @author Maulik
 * 
 */
public class Constructor_Chaining {

	public static void main(String[] args) {
		Chaning_Sub chaning_Sub = new Chaning_Sub();
	}
}

class Chaining_Parent {

	Chaining_Parent() {
		System.out
				.println("This is Constructor Chaining Constructor Super Class");
	}

}

class Chaning_Sub extends Chaining_Parent {

	Chaning_Sub() {
		this(10);
		System.out
				.println("This is Constructor Chaining Constructor Sub Class");
	}

	public Chaning_Sub(int i) {
		System.out.println("Overloaded Constructor Value :: " + i);
	}
}
