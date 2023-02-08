package java101.loops;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        double result = 0;

        for (int i = 1; i <= number; i++) {

            result+=1.0/i;

        }

        System.out.println("result = " + result);

    }
}
