package java101.conditionals;

import java.util.Scanner;

public class GroceryCashier {
    /*Write a program in Java that prints the total amount of the products purchased from the grocery store,
     according to the kilogram values, to the screen.
     Fruits and KG Prices as $
        Pear: 2.14 TL
        Apple : 3.67 TL
        Tomatoes: 1.11 TL
        Banana: 0.95 TL
        Eggplant : 5.00 TL
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("How many kgs pear do you want to buy?");
        int pearKG=input.nextInt();

        System.out.println("How many kgs apple do you want to buy?");
        int appleKG=input.nextInt();

        System.out.println("How many kgs tomatoes do you want to buy?");
        int tomatoesKG=input.nextInt();

        System.out.println("How many kgs banana do you want to buy?");
        int bananaKG=input.nextInt();

        System.out.println("How many kgs eggplant do you want to buy?");
        int eggplantKG=input.nextInt();

        double pearPrice=2.14;
        double applePrice=3.67;
        double tomatoesPrice=1.11;
        double bananaPrice=0.95;
        double eggplantPrice=5.00;

        double totalPrice=pearPrice*pearKG+applePrice*appleKG+tomatoesPrice*tomatoesKG+bananaPrice*bananaKG+eggplantPrice*eggplantKG;

        System.out.println("totalPrice = $" + totalPrice);
    }


}
