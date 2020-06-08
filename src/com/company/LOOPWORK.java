package com.company;

public class LOOPWORK {
    public static void main(String[] args){
        //line();
        top();
        //bottom();
        //line();
    }
    private static void top() {

        for (int line = 1; line <5; line ++){
            System.out.print("|");
            for (int spaces=1; spaces <-2*line+8; spaces++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for(int dots=1; dots <4*line-4; dots++){
                System.out.print(".");
            }

        }
        System.out.print("<>");

    }}

   // private static void bottom() {
       // System.out.println("|<>..........<>|");
        //System.out.println("| <>........<> |");
        //System.out.println("|   <>....<>   |");
        //System.out.println("|     <><>     |");


    //private static void line(){
        //System.out.println("#==============#");
