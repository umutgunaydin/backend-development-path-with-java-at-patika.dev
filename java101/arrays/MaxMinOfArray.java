package java101.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinOfArray {
    // Find the min and max element of array
    public static void main(String[] args) {

        int[] arr={56,34,1,8,101,-2,-33};

        int min=arr[0];
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
            if (max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        //Write a program that finds the nearest number smaller than the entered number
        // and the closest number of the elements in the array.
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number:");
        int number= input.nextInt();

        int closestSmaller= min;
        int closestGreater=max;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>number&&closestGreater>arr[i]){
                closestGreater=arr[i];
            }
            if (arr[i]<number&&closestSmaller<arr[i]){
                closestSmaller=arr[i];
            }
        }

        System.out.println("closestGreater = " + closestGreater);
        System.out.println("closestSmaller = " + closestSmaller);



    }
}
