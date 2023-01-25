package java101.conditionals;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        /*With Java, take the height and weight values from the user and assign them to a variable.
        Calculate the user's "Body Mass Index" according to the formula below and print it on the screen.
        index=weight/(height*height)
         */

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your weight:");
        double weight= input.nextDouble();

        System.out.println("Enter your height");
        double height= input.nextDouble();

        double massIndex=weight/(height*height);

        System.out.println("massIndex = " + massIndex);


    }
}
