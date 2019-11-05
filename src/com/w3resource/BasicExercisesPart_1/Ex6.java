package com.w3resource.BasicExercisesPart_1;

import java.util.Scanner;

public class Ex6{

	public void arithmetic(){
	
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input2.nextInt();
		int addition = num1 + num2;
		int subtract = num1 - num2;
		int multiple = num1 * num2;
		int divide = num1 / num2;
		int remainder = num1 % num2;
		
		
		System.out.println("" + num1 + " + " + ""+ num2 + " = " + "" + addition);
		System.out.println("" + num1 + " - " + ""+ num2 + " = " + "" + subtract);
		System.out.println("" + num1 + " x " + ""+ num2 + " = " + "" + multiple);
		System.out.println("" + num1 + " / " + ""+ num2 + " = " + "" + divide);
		System.out.println("" + num1 + " mod " + ""+ num2 + " = " + "" + remainder);
		
	
	}
	
	
	


}