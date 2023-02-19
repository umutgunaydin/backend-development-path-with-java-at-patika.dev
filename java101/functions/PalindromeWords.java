package java101.functions;

import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your word:");
        String word= input.next();

        System.out.println(isPalindrome(word));
    }

    public static boolean isPalindrome(String str){

        for (int i = 0,j=str.length()-1; i < str.length(); i++,j--) {
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
