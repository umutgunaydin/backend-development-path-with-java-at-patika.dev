package java102.adventureGame;

import java.util.Scanner;

public class Game {
    private Scanner input=new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to Adventure Game!");
        System.out.println("Enter your player name:");
        String playerName=input.nextLine();
        Player player=new Player(playerName);
        System.out.println("Welcome "+player.getName()+"!");

        System.out.println("Please choose your character:");
        player.selectChar();
    }
}
