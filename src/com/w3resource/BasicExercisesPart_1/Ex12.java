package com.w3resource.BasicExercisesPart_1;

import java.util.Scanner;

public class Ex12 {

    public void GetAverageOf5Numbers() {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextInt();
        double num2 = input.nextInt();
        double num3 = input.nextInt();
        double num4 = input.nextInt();
        double num5 = input.nextInt();

        System.out.println("Average = " + (num1 + num2 + num3 + num4 + num5) / 3);
    }

    public void GetAverage() {
        // Write your code here
        int Sum = 0;
        int totalNum;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to average?");
        totalNum = input.nextInt();

        for (int i = 1; i <= totalNum; i++) {
            System.out.println("Enter a number?");
            int numbers = input.nextInt();
            Sum += numbers;
        }

        System.out.println("The average is " + average(Sum, totalNum));
    }

    public static double average(int sumN, int countN) {
        return sumN / countN;
    }
}