package java101.loops;

import java.util.Scanner;

public class PowerOfNumbers {
    //We write a program that prints powers of 4 and 5 up to the number entered with Java loops.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number:");
        int number=input.nextInt();

        for (int i = 1,j=1; i < number && j<number; i*=4,j*=5) {
            System.out.println("power of 4s: "+i+"\tpower of 5s: "+j);
        }
    }
}
