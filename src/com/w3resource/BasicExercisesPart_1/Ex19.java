package com.w3resource.BasicExercisesPart_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ex19{

    static Scanner input = new Scanner(System.in);

    public void ConvertDecimalToBinary(){

        ArrayList<String> binary = new ArrayList<String>();

        System.out.print("Input a decimal number: ");
        var number = input.nextLong();

        ////method 1
        //System.out.print("Binary number is: " + Long.toString(number, 2));
        
        ////method 2
        //System.out.print("Binary number is: " + Long.toBinaryString(number));

        ////method 3
        while(number != 0){
            binary.add(String.valueOf(number % 2));
            number /= 2;
        }

        Collections.reverse(binary);
        System.out.print("Binary number: ");

        for (String digit : binary) {
            System.out.print(digit);
        }


    }
}