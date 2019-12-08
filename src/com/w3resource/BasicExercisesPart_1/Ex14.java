package com.w3resource.BasicExercisesPart_1;

public class Ex14{

    public void printUsaFlag(){
        //34 =
        //45 =
        //6 * 
        //6 firstWhitespace
        //5 *
        //7 secWhitespace

        // String outterStarAndLine = "* * * * * * ==================================";
        // String innerStarAndLine = " * * * * *  ==================================";
        // String line = "==============================================";
        // final int LIMITOUTTERSTARANDLINE = 5;
        // final int  LIMITINNERSTARANDLINE = 4;
        // final int LIMITLINE = 6;

        // for (int i = 0; i < LIMITOUTTERSTARANDLINE; i++) {
            
        //     System.out.println(outterStarAndLine);
            
        //     if(i < LIMITINNERSTARANDLINE){
        //         System.out.println(innerStarAndLine);
        //     }
            
        // }

        // for (int j = 0; j < LIMITLINE; j++) {
        //     System.out.println(line);
        // }

        final int FLAGSIZE = 15;
        final int STARSIZE = 9;

        for (int count = 1; count <= FLAGSIZE; count++) {
            if(count <= STARSIZE){

                if(count % 2==0){
                    System.out.println(" * * * * *  ==================================");
                }

                else{
                    System.out.println("* * * * * * ==================================");
                }
                
            }
            else{
                System.out.println("==============================================");
            }
        }
    }
}
