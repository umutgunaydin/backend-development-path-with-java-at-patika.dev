package java101.loops;

import java.util.Scanner;

public class CommonFloor_CommonDivisor {
    // this finds the least common floor and the greatest common divisor of given two numbers
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1= input.nextInt();

        System.out.println("Enter your second number:");
        int num2= input.nextInt();

        int tempNum1=num1;
        int tempNum2=num2;

        int leastCommonFloor=1;
        int greatestCommonDivisor=1;

        int min=Math.min(num1,num2);

        for (int i = 2; i <= min; i++) {
            if (tempNum1%i==0&&tempNum2%i==0) {
                greatestCommonDivisor *= i;
                leastCommonFloor *= i;
                tempNum1 /= i;
                tempNum2 /= i;
                i--;
            }
        }

        leastCommonFloor=num1*num2/greatestCommonDivisor;

        System.out.println("greatestCommonDivisor = " + greatestCommonDivisor);
        System.out.println("leastCommonFloor = " + leastCommonFloor);
    }
}
