package java101.loops.fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int number=input.nextInt();

        int element1=0;
        int element2=1;
        System.out.print(element1+" "+element2+" ");

        for (int i = 0; i < number - 2; i++) {
            System.out.print((element1+element2)+" ");
            int temp=element1+element2;
            element1=element2;
            element2=temp;
        }
    }
}
