package com.company;

public class Challege3 {
    //ntype casting is changing the original type of variable

    public static void main(String[] args) {
        double num1 = 9.7;
        int num2 = 5;
        double total;
        int total2;
 //       total = num1 +num2;
 //       System.out.println(total);
 //       total12 = (int)num1 +num2; //typecasted num1 from double to int
 //       System.out.println(total2);
        char letter=65;
        for(int i=12; i>0; i--){
            for(int j = 0; j <= i; j++)
            System.out.println( (char)(letter+i)+" ");
        }
    }
}
