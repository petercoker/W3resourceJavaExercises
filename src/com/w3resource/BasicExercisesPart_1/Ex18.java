package com.w3resource.BasicExercisesPart_1;
import java.util.Scanner;

public class Ex18{

    static Scanner input = new Scanner(System.in);

    public void AddMulitipleBinaryNumbers(){
    
    String b1, b2;

    System.out.print("Input first binary number: ");
    b1 = input.next();

    System.out.print("Input second binary number: ");
    b2 = input.next();

    input.close();

    long num1 = Long.parseLong(b1, 2);
    long num2 = Long.parseLong(b2, 2);
    long sum = num1 * num2;

    System.out.print("Product of two binary numbers: " + Long.toBinaryString(sum));

    }
}