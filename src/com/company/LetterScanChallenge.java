package com.company;

import java.util.Scanner;

public class LetterScanChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a phrase");
        String phrase = sc.nextLine();
        int IndexOf = phrase.indexOf(" ");
        String fisrtword = phrase.substring(0, IndexOf);
        char letterword = ' ';
        int count = 0;
        for (int all = 0; all < fisrtword.length(); all++) {

        }
    }
}
