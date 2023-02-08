package java101.loops;

import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName;
        String password;
        int right = 3;
        double balance = 1500;
        int select;

        while (right > 0) {

            System.out.println("Enter your user name:");
            userName = input.nextLine();

            System.out.println("Enter your password:");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("You have successfully logged in!");
                System.out.println("Welcome to Patika Bank!");
                do {
                    System.out.println("Please select your process:");
                    System.out.println("1-Deposit money\n" +
                            "2-Withdraw money\n" +
                            "3-Balance query\n" +
                            "4-Exit");
                    select= input.nextInt();
                    if (select==1){
                        System.out.println("Amount:");
                        double price= input.nextDouble();
                        balance+=price;
                    } else if (select == 2) {
                        System.out.println("Amount:");
                        double price= input.nextDouble();
                        if (price>balance){
                            System.out.println("Insufficient Balance!");
                        }else {
                            balance-=price;
                        }
                    } else if (select == 3) {
                        System.out.println("Balance = " + balance);
                    }
                }while (select!=4);
                System.out.println("See you later!");
                break;
            } else {
                right--;
                System.out.println("Login failed!");
                System.out.println("Remaining right:" + right);
            }
        }

    }
}
