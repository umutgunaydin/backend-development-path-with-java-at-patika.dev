package java101.conditionals;

import java.util.Scanner;

public class Circle {
    /*Write a program in Java that calculates the area and perimeter of a circle whose radius you get from the user.
    Area Formula: π * r * r;
    Environment Formula: 2 * π * r;
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius= input.nextDouble();

        double perimeter=2*Math.PI*radius;
        double area=Math.PI*radius*radius;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        //Write a program that finds the area of a slice of circle with radius r and measure 𝛼 of the central angle.

        System.out.println("Enter central angle:");
        double angle=input.nextDouble();

        double areaOfSlice=(Math.PI*radius*radius)*angle/360;
        System.out.println("areaOfSlice = " + areaOfSlice);
    }
}
