package java101.loops;

import java.util.Scanner;

public class NumberGuessingGame {
    //We are making a "Number Guessing Game" in Java
    // in which we want the user to guess a number randomly chosen by the program between 0-100.
    public static void main(String[] args) {

        int random=(int)(Math.random()*100);

        Scanner input=new Scanner(System.in);

        int right=5;
        while (right-->0){
            System.out.println("Enter your guess between [0,100]:");
            int guess=input.nextInt();
            if (guess<0||guess>100){
                System.out.println("Please enter your guess between given interval again! You have "+right+" rights remained!");
                continue;
            }
            if (guess==random){
                System.out.println("Congrats! You have guessed correctly!");
                break;
            }else if (guess>random&&right>=1){
                System.out.println("Unfortunately incorrect guess! Your guess is higher..Try again..You have "+right+" rights remained!");
            } else if (guess<random&&right>=1){
                System.out.println("Unfortunately incorrect guess! Your guess is lower..Try again..You have "+right+" rights remained!");
            }else {
                System.out.println("You have failed! Bye Bye..");
            }

        }
    }
}
