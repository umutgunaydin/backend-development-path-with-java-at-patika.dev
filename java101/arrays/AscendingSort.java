package java101.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter length of array:");
        int n= input.nextInt();

        int[] numbers=new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter element "+(i+1)+":");
            numbers[i]= input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]){
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
