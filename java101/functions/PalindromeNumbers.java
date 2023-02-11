package java101.functions;

import java.util.Scanner;

public class PalindromeNumbers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number:");
        int number= input.nextInt();

        System.out.println(isPalindrome(number));

    }

    public static boolean isPalindrome(int number){

        String num=""+number;

        String reversedNum="";

        for (int i = num.length()-1; i >= 0; i--) {
            reversedNum+=num.charAt(i);
        }

        if (num.equals(reversedNum)){
            return true;
        }else {
            return false;
        }
    }
}
