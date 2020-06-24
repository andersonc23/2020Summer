package com.company;
/*
create a random number between 5 and 10 for the size of the array
define two variables for swapping
create the swap method
substitute new variables into the existing code
 */

import java.util.Arrays;
import java.util.Random;

public class june23classwork {
    public static void main(String[]args) {
        Random rand=new Random();
     int size=rand.nextInt(5) + 5;//the bound is equal max-min(10-5)+the minimum
     int[]numbers =new int[size];

            for (int i = 0; i < numbers.length; i++) {
              numbers[i] = rand.nextInt(95) + 5;//defines values of the elements (5-100)
            }
            int index1;
            int index2;
            do {
                index1= rand.nextInt(size);//bound with size to make sure it doesn't go outside the size of the array
                index2= rand.nextInt(size);
            }while (index1 == index2);//while loop makes sure index1 and index 2 are different values
            System.out.println(Arrays.toString(numbers));
            numbers = swap(numbers, index1, index2);
            System.out.println(Arrays.toString(numbers));

        }
        public static int[] swap( int[] numbers, int index1, int index2){
                int temp=numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2]=temp;
                return numbers;
        }
    }
