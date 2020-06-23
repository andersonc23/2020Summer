package com.company;/*Caroline Anderson
Make int, double, String
Import scanner, make it so that it scans 3 times
print i + the int variable
print d + the int variable
 */
import java.util.*;

public class ChallengeDataType{
public static Scanner keyboard = new Scanner(System.in);
public static void main (String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "Greenhill";
    System.out.println("Type your inputs here:");

    System.out.print("Integer: ");
    int myInt = keyboard.nextInt();
    System.out.print("Double: ");
    double myDouble = keyboard.nextDouble();
    System.out.print("Phrase: ");
    keyboard.nextLine();
    String myString = keyboard.nextLine();
    System.out.printf("\n%2d ", myInt + i);
    System.out.printf("\n%.1f", myDouble + d);
    System.out.printf("n%2s ", s + " " + myString);

}

        }