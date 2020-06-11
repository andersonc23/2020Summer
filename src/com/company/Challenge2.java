package com.company;

public class Challenge2 {
    public static void main(String[] args) {

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
        System.out.println("+");
    }

    public static void top() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");

            for (int space = 1; space <= -1 * line + 6; space++) {
                System.out.print(" ");
            }
            for (int forwardslash = 1; forwardslash < line - 1; forwardslash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int backslash = 1; backslash < line - 1; backslash++) {
                System.out.print("\\");
            }
            for (int space = 1; space <= -1 * line + 6; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}