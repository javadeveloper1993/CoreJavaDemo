package com.example.accessmofier.Private;

/**
 * @author Maulik
 * 
 */
public class Private_AcessModifier {

	public static void main(String[] args) {
		Private_AcessModifier_Demo1 acessModifier = new Private_AcessModifier_Demo1();
		System.out.println("Name Is :: "
				+ acessModifier.return_Name("Mauik Patel"));
	}

	private String return_Name(String name) {
		return name;
	}
}

class Private_AcessModifier_Demo1 {

	private String return_Name(String name) {
		System.out.println("InSide Demo1 Method...!!!");
		return name;
	}
}
