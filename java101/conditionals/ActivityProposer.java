package java101.conditionals;

import java.util.Scanner;

public class ActivityProposer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter temperature:");
        int heat= input.nextInt();
        
        if (heat<5) System.out.println("SKIING");
        else if (heat<15) System.out.println("CINEMA");
        else if (heat<25) System.out.println("PICNIC");
        else if (heat>=25) System.out.println("SWIMMING");


    }
}
