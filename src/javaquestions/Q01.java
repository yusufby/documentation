package javaquestions;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

e.g:

char ch1= 'a' ;

String name =“John came late"

Expected Output: Number of a = 2*/

            Scanner scan =new Scanner(System.in);

            System.out.println("Enter a name");
            String name= scan.next();

            System.out.println("Enter a character");
            String character= scan.next();

            int count=0;

            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i)==character.charAt(0)){
                    count++;

                }

            } System.out.println("the character " + character + " is repeated: " + count);

        }
    }
