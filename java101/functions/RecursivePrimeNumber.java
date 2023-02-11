package java101.functions;

import java.util.Scanner;

public class RecursivePrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        boolean result = isPrime(number, 2);

        System.out.println("isPrimeNumber = " + result);
    }

    public static boolean isPrime(int number, int i) {

        if (number <= 2) {
            return (number == 2) ? true : false;
        } else if (number % i == 0) {
            return false;
        } else if (i * i > number) {
            return true;
        } else {
            return isPrime(number, i + 1);
        }

    }
}
