package java101.minefieldProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int row= input.nextInt();
        System.out.print("Enter number of columns:");
        int columns= input.nextInt();

        MineSweeper mineSweeper=new MineSweeper(row,columns);

        mineSweeper.run();

    }
}
