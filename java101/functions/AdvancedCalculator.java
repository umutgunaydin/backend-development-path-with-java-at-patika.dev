package java101.functions;

import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Addition\n"
                + "2- Subtraction \n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Power\n"
                + "6- Modulus\n"
                + "7- Area and perimeter of rectangle\n"
                + "O- Exit";

        System.out.println(menu);
        while (true){

            System.out.println("Enter your process number:");
            select = input.nextInt();
            if (select==0) break;
            System.out.println("Enter first number:");
            int num1= input.nextInt();
            System.out.println("Enter second number:");
            int num2= input.nextInt();

            switch (select){
                case 1:
                    System.out.println("Result="+sum(num1,num2));
                    break;
                case 2:
                    System.out.println("Result="+difference(num1,num2));
                    break;
                case 3:
                    System.out.println("Result="+times(num1,num2));
                    break;
                case 4:
                    System.out.println("Result="+divide(num1,num2));
                    break;
                case 5:
                    System.out.println("Result="+power(num1,num2));
                    break;
                case 6:
                    System.out.println("Result="+mod(num1,num2));
                    break;
                case 7:
                    System.out.println("Area="+area(num1,num2)+"  Perimeter="+perimeter(num1,num2));
                    break;
                default:
                    System.out.println("Invalid process number!");
                    break;
            }
        }

    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static int difference(int a,int b){
        return a-b;
    }

    public static int times(int a,int b){
        return a*b;
    }

    public static double divide(int a,int b){
        return (double) a/b;
    }

    public static int power(int a,int b){
        int result=1;
        for (int i = 0; i < b; i++) {
            result*=a;
        }
        return result;
    }

    public static int mod(int a,int b){
        return a%b;
    }

    public static int area(int a,int b){
        return a*b;
    }

    public static int perimeter(int a,int b){
        return 2*(a+b);
    }

}
