package com.company;
import java.util.*;
public class ConditionalStatement {
    public static void main(String[]args) {
        int n = 0; //random int
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        String answer;
        do {
            n = ran.nextInt(137) + 1;
            System.out.println(n);
            categories(n); //calling the method

            //making the program run after the user allows it
            System.out.print("Do you want to continue?");
            answer = input.nextLine();
        }  while (answer.contains("y"));
        }
        public static void categories (int n){

        //conditional statement that sorts the random number
            if (n % 2 != 0) {
                System.out.println("Weird");
            }else if (n >=2 && n <= 5) {
                System.out.println("Not weird");
            }else if (n>= 6 && n<= 20) {
                System.out.println("weird");
            }else if (n > 20) {
                System.out.println("Not weird");
            }
 }
}
