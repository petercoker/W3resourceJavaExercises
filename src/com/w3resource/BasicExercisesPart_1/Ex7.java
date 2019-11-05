package com.w3resource.BasicExercisesPart_1;

import java.util.Scanner;

public class Ex7{
    
    public void Multiplication(){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        final int upto = 10;

        for (int i = 1; i <= upto; i++) {
             int sum = num * i;
               System.out.println("" + num + " x " + "" + i + " = " +  "" + sum);
        }
    }
}