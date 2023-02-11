package java101.functions;

import java.util.Scanner;

public class RecursiveFibonacciSeries {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter number:");
        int number= input.nextInt();

        System.out.println(fibonacci(number));
    }

    public static int fibonacci(int number){
        if (number==1||number==2){
            return 1;
        }else{
            return fibonacci(number-1)+fibonacci(number-2);
        }
    }
}
