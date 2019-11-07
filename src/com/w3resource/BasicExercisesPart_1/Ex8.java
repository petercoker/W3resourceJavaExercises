package com.w3resource.BasicExercisesPart_1;

public class Ex8{

    public void PrintJavaPattern(){
        String[][] js = new String[4][4];

        js[0][0] = " ";
        js[0][1] = " ";
        js[0][2] = " ";
        js[0][3] = "J";

        js[1][0] = " ";
        js[1][1] = " ";
        js[1][2] = " ";
        js[1][3] = "J";

        js[2][0] = "J";
        js[2][1] = " ";
        js[2][2] = " ";
        js[2][3] = "J";

        js[3][0] = " ";
        js[3][1] = "J";
        js[3][2] = "J";
        js[3][3] = "J";        

        // Print elements using foreach loop
        for (int i = 0; i < js.length; i++) {
            for (int j = 0; j < js[i].length; j++) {
                System.out.print(js[i][j]);
            }
            System.out.println("\n");
        }


        // Print elements using foreach loop

        // for (String[] innerArray : js) {
        //     for (String data : innerArray) {
        //         System.out.print(data);
        //     }
        //     System.out.print("\n");
        // }



        
        


    }
}