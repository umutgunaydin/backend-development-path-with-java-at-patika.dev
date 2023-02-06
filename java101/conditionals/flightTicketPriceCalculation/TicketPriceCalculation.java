package java101.conditionals.flightTicketPriceCalculation;

import java.util.Scanner;

public class TicketPriceCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance;
        int age;
        int flightType;
        double pricePerKM = 0.1;
        double ageDiscount=0;

        System.out.println("Enter your age:");
        age = input.nextInt();

        if (age < 0) System.out.println("Incorrect input");

        System.out.println("Enter flight distance as km:");
        distance = input.nextDouble();

        if (distance < 0) System.out.println("Incorrect input");

        System.out.println("Enter your flight type (1 for One Way, 2 for Round Trip):");
        flightType = input.nextInt();

        if (!(flightType == 1 || flightType == 2)) System.out.println("Incorrect input");

        double normalPrice=distance*pricePerKM;

        if (age<12){
            ageDiscount=0.5;
        } else if (age < 24) {
            ageDiscount=0.1;
        } else if (age > 65) {
            ageDiscount=0.3;
        }

        double totalPrice=normalPrice-(normalPrice*ageDiscount);

        if (flightType==1){
            System.out.println("Total Price: "+totalPrice);
        } else if (flightType == 2) {
            double typeDiscount=0.2;
            totalPrice=totalPrice-(totalPrice*typeDiscount);
            totalPrice*=2;
            System.out.println("Total Price: "+totalPrice);
        }


    }
}
