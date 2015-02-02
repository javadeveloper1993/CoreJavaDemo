package com.example.accessmofier.Protected1;

import com.example.accessmofier.Protected.Protected_AcessModifier;

/**
 * @author Maulik
 * 
 */
public class Protected_AcessModifier_Child extends Protected_AcessModifier {

	public static void main(String[] args) {
		new Protected_AcessModifier_Child().test();
	}

	public void test() {
		display();
		System.out.println("Test IS :: " + test);
	}

}
