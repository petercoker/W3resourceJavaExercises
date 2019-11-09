package com.w3resource.BasicExercisesPart_1;

public class Ex11{

    public String GetArea(double radius){
        return "Area is = " + Math.PI * Math.pow(radius, 2);
    }
    
    public String GetPerimeter(double radius){
        return "Perimeter is = " + 2 * Math.PI * radius;
    }
}