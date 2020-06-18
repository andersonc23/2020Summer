package com.company;

import java.util.Scanner;

public class june17classwork {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What is your height in inches?");
    String height = input.nextLine();

    System.out.println("What is your weight in pounds?");
    double weight = input.nextDouble();

    double BMI = weight/Math.pow(height,2) *703;

    if (BMI <=18.5) {
        System.out.println("You're underweight");

    }
    else if (BMI <25.0){
        System.out.print("You're normal");

    }
    else if (BMI<30){
        System.out.print("You're overweight");

    }
    else if (BMI>=30){
        System.out.print("You're obese");
    }

        }

}
