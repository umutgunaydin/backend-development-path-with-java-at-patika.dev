package java101.functions;

import java.util.Scanner;

public class GameOfFive {
    //Subtract the number 5 from the entered number up to where the entered number is 0 or negative.
    // Print the last value to the screen during each subtraction. Add 5 again after the number is negative or 0.
    // Again, print the last value of the number on the screen in each addition operation.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number:");
        int number= input.nextInt();

        gameOfFive(number);
    }

    public static void gameOfFive(int number){
           if (number > 0) {
               System.out.print(number+" ");
               gameOfFive(number-5,number);
           } else{
               number+=5;
               System.out.print(number+" ");
               gameOfFive(number);
           }
    }

    public static void gameOfFive(int number,int exactNumber){
        if (number > 0) {
            System.out.print(number+" ");
            gameOfFive(number-5,exactNumber);
        } else{
            while (number<=exactNumber){
                System.out.print(number+" ");
                number+=5;
            }

        }
    }
}
