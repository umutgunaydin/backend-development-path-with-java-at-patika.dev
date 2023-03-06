package java102.adventureGame;

import java102.adventureGame.gameCharacters.Archer;
import java102.adventureGame.gameCharacters.GameCharacter;
import java102.adventureGame.gameCharacters.Knight;
import java102.adventureGame.gameCharacters.Samurai;

import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        GameCharacter[] characters = {new Samurai(), new Archer(), new Knight()};
        System.out.println("----------------------");
        for (GameCharacter character : characters) {
            System.out.println("ID: " + character.getId() + "\t Character: " + character.getName() + "\t Damage: " + character.getDamage() +
                    "\t Health: " + character.getHealth() + "\t Money: " + character.getMoney());
        }
        System.out.println("----------------------");
        System.out.println("Please select your character number!");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
        System.out.println("Character: " + this.getCharName() + ", Damage: " + this.getDamage() + ", Health: " +
                this.getHealth() + ", Money: " + this.getMoney());
    }

    public void initPlayer(GameCharacter character) {
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setMoney(character.getMoney());
        this.setCharName(character.getName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
