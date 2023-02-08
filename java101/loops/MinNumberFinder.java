package java101.loops;

import java.util.Scanner;

public class MinNumberFinder {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int count= input.nextInt();
        int minNumber;

        System.out.print("Enter number 1: ");
        minNumber= input.nextInt();

        for (int i = 2; i <=count ; i++) {
            System.out.print("Enter number "+i+": ");
            int number= input.nextInt();
            if (number<minNumber){
                minNumber=number;
            }
        }

        System.out.println("minNumber = " + minNumber);
    }
}
