package java101.conditionals;

import java.util.Scanner;

public class CalculateHypotenuseAndArea {
    /*Write a program in Java that takes the length of the perpendicular sides from the user
    and calculates the hypotenuse.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first perpendicular side:");
        double side1= input.nextDouble();
        System.out.println("Enter second perpendicular side:");
        double side2= input.nextDouble();

        double hypo=Math.sqrt(side1*side1+side2*side2);

        System.out.println("hypotenuse = " + hypo);

        double area=side1*side2/2;

        System.out.println("area = " + area);
    }
}
