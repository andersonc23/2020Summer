/*
Caroline Anderson Final Project Code-game to try and guess a word/num in the file
Create a file
    20 lines with 20 tokens each, some foods, some integers, some doubles
Create a second file with welcome message

import java.util
import java.io


MAIN
throws FileNotFoundException
keep it simple. just call welcome method and game play


WELCOME(static void)
??????Throws exception?
create object for welcome file and then create a scanner that scans that file
while there is a next(), println


GAMEPLAY(static void)
create a scanner for input
delcare playAgain, word, wordInt, wins, games

do while around all for if playAgain contains y
    create object for file and scanner to go with it
    print if they want to play with words or numbers
    use input scanner to get their answer set to wordsInt
    if wordsInt contains word
        print guess a food
        use scanner to receive answer from user
        set wins to equal wordSearch(of word, wins, and filesc)
    else
        go to numberSearch with wins and filesc=wins
    add to game total ++
    print score (wins/games)
    ask if they want to play again
    use scanner input to get answer (and if it has a y runs again)

if playAgain has a n
    print final score


WORDSEARCH (return method) (receive string word, int wins, scanner filesc)
create trash

While there is another something
    if the word equals next()
        print congrats message
        add ++ to wins
        break (returns back)
    else
        make trash= next to consume

return wins (keeps track of score)


NUMBERSEARCH (return method) (receive int wins, scanner filesc)
create scanner for input

ask if they want integers or real numbers (doubles)
use scanner input to get answer

if answer contains int
    print enter an int
    use scanner input to receive
    send num, wins, and filesc to integer method and =wins
else
    if answer contains num
    print to enter a real number
    use scanner to get that number=num
    to eliminate weird decimal places- multiply num by 100 and convert to int
    and divide by 100.0 to get back
    send num, wins, filesc to doubles method =wins

return wins


INTEGERS (return method) (receive num, wins, filesc)
create trash

while there is next
    if has next int
        if it is equal to num
            print congrats message
            wins ++
            break (return back)
    else
        trash next

return wins


DOUBLES (return method) (receive num, wins, filesc)
create trash

while next
    if it is double
        if it is equal to num
            print congrats message
            wins++
            break
    else
        trash next

return wins for win count
*/
package com.company;
//import util for scanner and io for file
import java.util.*;
import java.io.*;

public class Final {
    public static void main(String[] args) throws FileNotFoundException //make sure to have throws
    {
        welcome();
        gameplay();

    }

    public static int wordSearch(String word, int wins, Scanner filesc) throws FileNotFoundException {
        //create stuff for scanning the file

        String trash = "";
        while (filesc.hasNext()) {
            if (word.equals(filesc.next())) {
                System.out.println("Congrats! You found a word!");
                wins++;
                break;
            }
        }

        return wins;
    }

    public static int numberSearch(int win, Scanner filesc) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        //create variable for if won
        //double or integer
        System.out.println("Would you like to do an integer or a real number?");
        String intDouble = input.next();

        //integer path
        //get the integer
        if (intDouble.contains("int")) {
            System.out.println("Enter an integer!");
            int num = input.nextInt();

            //creating trash. make message if answer is the same
            String trash;
            while (filesc.hasNextLine()) {

                //if it is found then it will tell you that it found it and then add to the count
                if (filesc.hasNextInt()) {
                    int num2= filesc.nextInt();
                    if (num2 == num) {
                        System.out.println("Congrats! You found a number in the file!");
                        win++;
                        break;
                    }
                } else {
                    trash = filesc.next();
                }
            }

        }

        //double path
        //getting user's double
        else if (intDouble.contains("num")) {
            System.out.println("Enter a real number!");
            double num = input.nextDouble();
            num = (((int) (num*100))/100.0);


            //create trash for words
            String trash;
            while (filesc.hasNextLine()) {
                //if it is found then it will tell you that it found it and then add to the count
                if (filesc.hasNextDouble()) {
                    if (filesc.nextDouble() == num) {
                        System.out.println("Congrats! You found a number!");
                        win++;
                        break;
                    }
                } else {
                    trash = filesc.next();
                    System.out.println("That number wasn't in the list.");
                }
                //for if the number wasn't found


            }
        }
        return win;
    }

    public static void welcome() throws FileNotFoundException {
        File welcome = new File("/Users/carolineanderson/IdeaProjects/Summer2020/src/com/company/welcome.txt");
        Scanner welcomesc = new Scanner(welcome);
        //welcome file and reading it
        while (welcomesc.hasNext()) {
            System.out.println(welcomesc.nextLine());
        }
    }

    public static void gameplay() throws FileNotFoundException {
            Scanner input = new Scanner(System.in);


            //declare variables to be used inside the do while (can't be declared inside)
            String playAgain;
            String wordsInts;
            String word;
            int games = 0;
            int wins = 0;


            //do while to play again
            do {
                File file = new File("/Users/carolineanderson/IdeaProjects/Summer2020/src/com/company/finalprojectfile.txt");
                Scanner filesc = new Scanner(file);
                //words or numbers decision
                System.out.println("Would you like to play with words or numbers?");
                wordsInts = input.next();

                //for words, have the person guess food and send that word to
                if (wordsInts.contains("word")) {
                    System.out.println("Guess a food!");
                    word = input.next();
                    wins = wordSearch(word, wins, filesc);
                } else {
                    wins = numberSearch(wins, filesc);
                }
                games++;
                System.out.println("Score: " + wins + "/" + games);
                System.out.println("Would you like to play again?");
                playAgain = input.nextLine();
                filesc.close();
            } while (playAgain.contains("y"));
            if (playAgain.contains("n")){
                System.out.println("final score: "+wins+"/"+games);
            }
        }
    }
