package com.w3resource.BasicExercisesPart_1;

public class Ex16{

    public void PrintFace(){

        String [] face = new String[5];

        face[0] = " +\"\"\"\"\"+ ";
        face[1] = "[| o o |]";
        face[2] = " |  ^  |";
        face[3] = " | '-' |";
        face[4] = " +-----+";

        for (String part : face) {
            System.out.println(part);
        }
       
    }
}