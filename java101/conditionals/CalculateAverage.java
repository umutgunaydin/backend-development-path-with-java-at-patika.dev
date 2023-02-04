package java101.conditionals;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        /*    Write a program that takes the exam scores of Mathematics, Physics, Chemistry,
         Turkish, History, Music courses from the user and calculates the averages
         and prints them on the screen with Java.
         */
        Scanner input = new Scanner(System.in);

        int math, phys, chem, turk, hist, mus;

        System.out.print("Input Score of Math:");
        math = input.nextInt();
        math=(math>=0&&math<=100)?math:0;

        System.out.print("Input Score of Physics:");
        phys = input.nextInt();
        phys=(phys>=0&&phys<=100)?phys:0;

        System.out.print("Input Score of Chemistry:");
        chem = input.nextInt();
        chem=(chem>=0&&chem<=100)?chem:0;

        System.out.print("Input Score of Turkish:");
        turk = input.nextInt();
        turk=(turk>=0&&turk<=100)?turk:0;

        System.out.print("Input Score of History:");
        hist = input.nextInt();
        hist=(hist>=0&&hist<=100)?hist:0;

        System.out.print("Input Score of Music:");
        mus = input.nextInt();
        mus=(mus>=0&&mus<=100)?mus:0;

        int sum = math + phys + chem + turk + hist + mus;

        double average = sum / 6.0;

        System.out.println("Average = " + average);

        System.out.println((average > 60) ? "Passed" : "Failed");


    }
}
