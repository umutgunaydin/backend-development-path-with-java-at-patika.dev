package java101.conditionals;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        /*    Write a program that takes the exam scores of Mathematics, Physics, Chemistry,
         Turkish, History, Music courses from the user and calculates the averages
         and prints them on the screen with Java.
         */
        Scanner input=new Scanner(System.in);

        int math,phys,chem,turk,hist,mus;

        System.out.print("Input Score of Math:");
        math=input.nextInt();

        System.out.print("Input Score of Physics:");
        phys=input.nextInt();

        System.out.print("Input Score of Chemistry:");
        chem=input.nextInt();

        System.out.print("Input Score of Turkish:");
        turk=input.nextInt();

        System.out.print("Input Score of History:");
        hist=input.nextInt();

        System.out.print("Input Score of Music:");
        mus =input.nextInt();

        int sum=math+phys+chem+turk+hist+mus;

        double average=sum/6.0;

        System.out.println("Average = " + average);

        if (average>60) System.out.println("Passed");
        else System.out.println("Failed");



    }
}
