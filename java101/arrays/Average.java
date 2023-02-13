package java101.arrays;

public class Average {
    // this calculates the average of the elements of the array
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        double sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        double average=sum/arr.length;

        System.out.println("average = " + average);
    }
}
