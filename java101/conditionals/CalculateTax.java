package java101.conditionals;

import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        /*Write a program that calculates the VAT value
        and the VAT amount of the money value received from the user with Java and prints it on the screen.
        (Note: Take the VAT amount as 18%)
         */
        Scanner input=new Scanner(System.in);

        double VAT;

        System.out.print("Enter the price without tax:");
        double price=input.nextDouble();

        if (price>1000) VAT=8/100d;
        else VAT=18/100d;

        double tax=price*VAT;
        double priceWithTax=price+tax;

        System.out.println("tax = " + tax);
        System.out.println("priceWithTax = " + priceWithTax);




    }
}
