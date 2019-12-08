package com.w3resource.BasicExercisesPart_1;

import java.util.Scanner;

public class Ex13{

    
    // Test Data:
    // Width = 5.5 Height = 8.5

    // Expected Output
    // Area is 5.6 * 8.5 = 47.60
    // Perimeter is 2 * (5.6 + 8.5) = 28.20 

    public void GetArea(double width, double height){
        System.out.println("Area is " + width + " *" + " " + height + " = " + width * height);
    }

    public void GetPerimeter (double width, double height){
        System.out.println("Perimeter is 2 * (" + width + " +" + " " + height + ") = " + 2 * (width + height));
    }



}