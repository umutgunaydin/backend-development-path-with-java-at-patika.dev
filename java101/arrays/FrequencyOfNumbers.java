package java101.arrays;

public class FrequencyOfNumbers {
    //find the frequency of numbers in an array
    public static void main(String[] args) {

        int[] arr={1,2,2,1,1,2,5,2};
        int[] duplicateNumbers=new int[arr.length];

        int index=0;
        for (int each : arr) {
            int count=0;
            for (int each2 : arr) {
                if (each2==each){
                    count++;
                }
            }
            if (!isFind(duplicateNumbers,each)){
                System.out.println("Frequency of "+each+"= "+count);
                duplicateNumbers[index]=each;
                index++;
            }
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
