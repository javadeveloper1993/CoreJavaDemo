package com.example.interfaceDeclaration;

/**
 * @author Maulik
 * 
 */
public class InterfaceImplementClass implements TempInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Test Interface Value : " + TEST);
		// TEST=13; // Constant Cant Modify
		InterfaceImplementClass class1 = new InterfaceImplementClass();
		int test = class1.test(10, 10);
		System.out.println("Test Interface Value : " + test);
	}

	@Override
	public int test(int no1, int no2) {
		return no1 + no2;
	}
}
