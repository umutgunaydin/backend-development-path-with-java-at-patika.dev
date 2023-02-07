package java101.loops;

import java.util.Scanner;

public class PowerOfGivenNumbers {
    //Use the "For Loop" program that calculates exponential numbers with the values entered by the user in Java.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base number:");
        int base = input.nextInt();

        System.out.println("Enter the power number:");
        int power = input.nextInt();

        int result = 1;

        for (int i = 0; i < power; i++) {
                result*=base;
        }

        System.out.println("result = " + result);

    }
}
