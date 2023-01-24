package java101.conditionals;

import java.util.Scanner;

public class CalculateTaximeter {
    /*Write a program that prints the taximeter amount on the screen according to the distance traveled (KM) with Java.
    Taximeter costs 2.20 TL per km.
    The minimum amount to be paid is 20 TL. 20 TL will be charged for the fees below 20 TL.
    The taximeter opening fee is 10 TL.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter distance as km:");
        double distance=input.nextDouble();

        double fee=10d;

        fee+=distance*2.2;

        if (fee<20) fee=20;

        System.out.println("fee = " + fee);


    }
}
