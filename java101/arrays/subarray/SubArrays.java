package java101.arrays.subarray;

import java.util.Scanner;

public class SubArrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        scan.nextLine();

        String nums=scan.nextLine();

        String[] strNums=nums.split(" ");
        int[] arrNums=new int[strNums.length];

        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i]=Integer.parseInt(strNums[i]);
        }

        int result=0;
        for (int i = 0; i < arrNums.length; i++) {
            int sum=arrNums[i];

            if (sum<0) result++;

            for (int j = i+1; j < arrNums.length; j++) {
                sum+=arrNums[j];
                if (sum<0) result++;
            }

        }
        System.out.println(result);
    }
}
