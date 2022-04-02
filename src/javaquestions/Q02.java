package javaquestions;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :

30 and 40

Expected OutPut:

GCD for 30 and 40 = 10

LCM for 30 and 40 = 120*/

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1= scan.nextInt();
        System.out.println("Enter second number");
        int num2= scan.nextInt();

        int gcd = 1;
        int lcm = 1;


        for (int i = 1; i <num1; i++) {
            if (num1%i==0 && num2%i==0){
                gcd=i;

            }
        }System.out.println( "Greatest Common Divisor) "+gcd);
        System.out.println("-------------------------");
        for (int i = 1; i <num1 ; i++) {
            if (num1%i==0 || num2%i==0)
            {
                lcm=lcm*i;
                if (lcm>num1 && lcm>num2){
                    break;
                }
            }

        }System.out.println("Least Common Multiple " +lcm);

    }
    }
