package java101.loops;

import java.util.Scanner;

public class DivisibleNumbersFinder {
    //Program that calculates the average of dimensions divisible by 3 and 4
    // from numbers from 0 to the number entered with Java loops.
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter number:");
        int number=input.nextInt();
        int sum=0;
        int numberOfNumbers=0;

        for (int i = 1; i <= number; i++) {
            if (i%3==0&&i%4==0){
                sum+=i;
                numberOfNumbers++;
            }
        }

        double result=sum/numberOfNumbers;
        System.out.println("result = " + result);
    }
}
