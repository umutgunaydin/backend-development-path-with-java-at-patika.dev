package java101.conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first number:");
        double num1= input.nextDouble();

        System.out.println("Enter your second number:");
        double num2= input.nextDouble();

        System.out.println("Enter your operator type(*, /, +, -):");
        String operator=input.next();

        switch (operator){
            case "*":
                System.out.println(num2*num1);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
        }


    }
}
