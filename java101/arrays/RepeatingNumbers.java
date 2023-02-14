package java101.arrays;

import java.util.Arrays;

public class RepeatingNumbers {
    // find repeating numbers in an array
    public static void main(String[] args) {

        int[] numbers = {1, 7, 2, 3, 3, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicateNumbers = new int[numbers.length];

        int startIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            int each = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && each == numbers[j]) {
                    if (!isFind(duplicateNumbers, each)) {
                        duplicateNumbers[startIndex++] = each;
                        break;
                    }
                }
            }
        }

        System.out.println("Repeating numbers:");
        for (int each : duplicateNumbers) {
            if (each!=0)
                System.out.print(each+" ");
        }
    }

    public static boolean isFind(int[] arr, int value) {
        for (int each : arr) {
            if (each == value) {
                return true;
            }
        }
        return false;
    }
}
