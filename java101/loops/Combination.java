package java101.loops;

import java.util.Scanner;

public class Combination {
    //The number of different groups with r elements to be formed with the elements of a set with n elements is called the r combination of n.
    // The r combination of N is denoted as C(n,r).
    //Write a program that calculates combinations in Java.
    //C(n,r) = n! / (r! * (n-r)!)
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your number of elements in a set:");
        int numberOfElements=input.nextInt();

        System.out.println("Enter your combination number:");
        int combinationNumber= input.nextInt();

        int result=factorial(numberOfElements)/(factorial(combinationNumber)*factorial(numberOfElements-combinationNumber));

        System.out.println("result = " + result);
    }

    public static int factorial(int num){
        int result=1;

        for (int i = 1; i <= num; i++) {
            result*=i;
        }
        return result;
    }
}
