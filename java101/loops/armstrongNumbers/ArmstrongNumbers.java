package java101.loops.armstrongNumbers;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your number:");
        int number= input.nextInt();
        int tempNumber=number;

        int numberOfDigits=(""+number).length();

        int result=0;

        for (int i = 0; i < numberOfDigits; i++) {
            int remainder=tempNumber%10;
            tempNumber/=10;
            result+=Math.pow(remainder,numberOfDigits);
        }

        if (number==result){
            System.out.println(number+" is an Armstrong number!");
        }else {
            System.out.println(number+" is not an Armstrong number!");
        }

    }
}
