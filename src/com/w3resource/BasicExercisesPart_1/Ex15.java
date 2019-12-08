package com.w3resource.BasicExercisesPart_1;
import java.util.Scanner;


public class Ex15{

    static Scanner input = new Scanner(System.in);

    public void SwapTwoInteger(){

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int tempNumber;

        tempNumber = num2;
        num2 = num1;
        num1 = tempNumber;

        System.out.println("First number: " + num1 + "\nSecond number: " + num2);
        
    }
}

