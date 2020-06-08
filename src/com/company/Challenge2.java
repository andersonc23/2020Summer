package com.company;

public class Challenge2{
    public static void main(String[]args) {

        line();
        top();
        //bottom();
        line();
    }
    public static void line() {
        System.out.print("+");
        for (int dash = 0; dash < 9; dash++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
    public static void top(){
        System.out.print("|");

        for (int space = 1; space <= -1
                * 2 + 6; space++) {
            System.out.print(" ");
        }
        for (int forwardslash = 1;
             forwardslash < 2 - 1;
             forwardslash++) {
            System.out.print("/");
        }
        System.out.print("*");
        for (int backslash = 1;
             backslash < 2 - 1; backslash++) {
            System.out.print("\\");
        }
        for (int space = 1; space <= -1
                * 2 + 6; space++) {
            System.out.print(" ");
        }
        System.out.print("|");

        for (int space = 1; space <= -1
                * 3 + 6; space++) {
            System.out.print(" ");
        }
        for (int forwardslash = 1;
             forwardslash < 3 - 1;
             forwardslash++) {
            System.out.print("/");
        }
        System.out.print("*");
        for (int backslash = 1;
             backslash < 3 - 1; backslash++) {
            System.out.print("\\");
        }
        for (int space = 1; space <= -1
                * 3 + 6; space++) {
            System.out.print(" ");
        }
        System.out.print("|");

        for (int space = 1; space <= -1
                * 4 + 6; space++) {
            System.out.print(" ");
        }
        for (int forwardslash = 1;
             forwardslash < 4 - 1;
             forwardslash++) {
            System.out.print("/");
        }
        System.out.print("*");
        for (int backslash = 1;
             backslash < 4 - 1; backslash++) {
            System.out.print("\\");
        }
        for (int space = 1; space <= -1
                * 4 + 6; space++) {
            System.out.print(" ");
        }
        System.out.print("|");

        for (int space = 1; space <= -1
                * 5 + 6; space++) {
            System.out.print(" ");
        }
        for (int forwardslash = 1;
             forwardslash < 5 - 1;
             forwardslash++) {
            System.out.print("/");
        }
        System.out.print("*");
        for (int backslash = 1;
             backslash < 5 - 1; backslash++) {
            System.out.print("\\");
        }
        for (int space = 1; space <= -1
                * 5 + 6; space++) {
            System.out.print(" ");
        }
    }
}


