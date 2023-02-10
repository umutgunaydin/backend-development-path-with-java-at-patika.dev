package java101.loops.perfectNumbers;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number:");
        int number= input.nextInt();

        int perfectSum=0;

        for (int i = 1; i <number ; i++) {
            if (number%i==0){
                perfectSum+=i;
            }
        }

        if (perfectSum==number){
            System.out.println("It's a perfect number!");
        }else{
            System.out.println("It's not a perfect number!");
        }
    }
}
