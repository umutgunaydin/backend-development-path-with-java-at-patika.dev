package java101.loops;

import java.util.Scanner;

public class MinNumberFinder {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int count= input.nextInt();
        int minNumber;
        int maxNumber;

        System.out.print("Enter number 1: ");
        minNumber= input.nextInt();
        maxNumber=minNumber;

        for (int i = 2; i <=count ; i++) {
            System.out.print("Enter number "+i+": ");
            int number= input.nextInt();
            if (number<minNumber){
                minNumber=number;
            }
            if (number>maxNumber){
                maxNumber=number;
            }
        }

        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);
    }
}
