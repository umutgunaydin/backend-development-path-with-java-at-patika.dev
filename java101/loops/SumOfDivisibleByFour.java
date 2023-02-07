package java101.loops;

import java.util.Scanner;

public class SumOfDivisibleByFour {
    //With Java loops, we write a program that accepts inputs from the user until a single number is entered
    // and collects even and multiples of 4 from the entered values and prints it on the screen.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number;
        int sum=0;

        do {
            System.out.println("Enter number:");
            number=input.nextInt();
            if (number%4==0) sum+=number;
        }while (number%2==0);

        System.out.println("sum = " + sum);


    }
}
