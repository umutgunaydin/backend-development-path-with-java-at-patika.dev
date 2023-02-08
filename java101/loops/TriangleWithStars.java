package java101.loops;

import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = number - 2; i >= 0; i--) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
