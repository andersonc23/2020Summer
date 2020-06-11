package com.company;

public class GangstaName {
    public static void main(String[] args) {
  /*–first initial
–Diddy
–last name (all caps)
–first name
–-izzle
Example Output:
Type your name, playa: Marge Simpson
Your gangsta name is "M. Diddy SIMPSON Marge-izzle" */
        String teacher = "Caroline Anderson";
        sayHi(teacher);
        System.out.println(teacher.substring(3,7));
  //      sayHi(teacher);
        Challenge2.line();
    }

    public static void sayHi(String name) {

            char letter;
            letter = name.charAt(0);
        int indexOf = name.indexOf(" ");
        String lastName = name.substring(indexOf);
            System.out.println("The character = " + letter);

        }

    }
}

