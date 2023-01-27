package java101.conditionals;

import java.util.Scanner;

public class UserLogin {
    /*If the password is wrong, ask the user whether he can reset his password,
    if the user wants to reset it,
    check that the new password must not be the same as the password he entered incorrectly and forgot,
     and if the passwords are the same, the screen "Could not create password, please enter another password."
     If there is no problem, write the program that says "Password created".
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String userName="patika";
        String password="java123";

        System.out.println("Enter your username:");
        String givenUserName=input.next();

        System.out.println("Enter your password:");
        String givenPassword=input.next();

        if (userName.equals(givenUserName)&&password.equals(givenPassword)){
            System.out.println("You have logged in!");
        }else {
            System.out.println("Do you want to reset your credentials?(yes/no)");
            String answer=input.next();
            if (answer.equals("yes")){
                System.out.println("Enter your new password:");
                password=input.next();
                if (password.equals("java123")){
                    System.out.println("Could not create password, please enter another password.");
                }else {
                    System.out.println("Your credentials have been reset!");
                }
            }else {
                System.out.println("Incorrect credentials!");
            }
        }
    }
}
