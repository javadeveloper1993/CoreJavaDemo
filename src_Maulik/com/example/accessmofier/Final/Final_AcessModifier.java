package com.example.accessmofier.Final;

/**
 * @author Maulik
 * 
 */
public class Final_AcessModifier {

	protected int test = 10;

	public static void main(String[] args) {
		new Final_AcessModifier().display(5, 15);
	}

	protected void display(int no1, final int no2) {
		int No1 = no1;
		final int No2 = no2;
		No2 = 12; // Final Modifier can not ReAssign
		System.out.println("No1 :: " + No1 + " No2 :: " + No2);
		// This is Test
	}
}
