package java101.loops;

import java.util.Scanner;

public class InvertedTriangle {
    //Write a program in Java that takes the number of digits from the user
    // and draws an inverted triangle to the screen with asterisks (*) using loops.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of digits:");
        int number= input.nextInt();

        for (int i = number; i >0 ; i--) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
