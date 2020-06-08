package com.company;

public class Challenge1 {
    public static void main(String[] args){
        line();
        top();
        bottom();
        line();
    }



    private static void top() {
        System.out.println("|     <><>     |");
        System.out.println("|   <>....<>   |");
        System.out.println("| <>........<> |");
        System.out.println("|<>..........<>|");
    }

private static void bottom() {
        System.out.println("|<>..........<>|");
        System.out.println("| <>........<> |");
        System.out.println("|   <>....<>   |");
        System.out.println("|     <><>     |");
        }

private static void line(){
        System.out.println("#==============#");
        }}
