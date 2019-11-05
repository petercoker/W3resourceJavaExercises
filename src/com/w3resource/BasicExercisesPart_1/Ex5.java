package com.w3resource.BasicExercisesPart_1;
import java.util.Scanner;

public class Ex5 {

    public double Multiple(double num1, double num2){
        return num1 * num2;
    }
	
	public void Multiple(){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
		
		int num1 = input.nextInt();
        int num2 = input2.nextInt();
        int sum = num1 * num2;
		
		System.out.print("" + num1 + " x" + " " + num2 + " =" + " " + sum);
    }
	
	   


}
