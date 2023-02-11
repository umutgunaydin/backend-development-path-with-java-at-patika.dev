package java101.functions;

import java.util.Scanner;

public class RecursiveExponentiation {
    //Write a program that performs exponentiation, whose base and exponent values are taken from the user,
    // using the "Recursive" method.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter base number:");
        int base= input.nextInt();
        System.out.println("Enter power number:");
        int power=input.nextInt();

        double result=power(base,power);

        System.out.println("result = " + result);
    }

    public static double power(double num1,double num2){
        if (num2==0) return 1;
        else if (num2<0) {
            num1=1/num1;
            num2=-num2;
        return num1*power(num1,num2-1);
        }
        else if (num2==1){
            return num1;
        }else {
            return num1*power(num1,num2-1);
        }
    }
}
