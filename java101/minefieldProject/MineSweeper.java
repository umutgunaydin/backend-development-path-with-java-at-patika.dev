package java101.minefieldProject;

import java.util.Scanner;

public class MineSweeper {

    int row;
    int column;
    int numberOfMines;
    String[][] gameField;
    int[][] locationOfMines;

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.numberOfMines = (row * column) / 4;
        this.gameField = new String[row][column];
        this.locationOfMines = new int[row * column][2];
        placeMines();
    }

    public void placeMines() {
        int mines = 0;

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                int random = (int) (Math.random() * 10);
                if (random >= 7 && mines < numberOfMines) {
                    gameField[i][j] = "*";
                    locationOfMines[mines][0] = i;
                    locationOfMines[mines][1] = j;
                    mines++;
                } else {
                    gameField[i][j] = "-";
                }
            }
        }
    }

    public void run() {
        Scanner input=new Scanner(System.in);
        System.out.println("Location Of Mines:");
        printGameTable(gameField);

        String[][] runningGame = new String[row][column];
        for (int i = 0; i < runningGame.length; i++) {
            for (int j = 0; j < runningGame.length; j++) {
                runningGame[i][j]="-";
            }
        }

        boolean hasRight = true;
        while (hasRight) {
            System.out.println("=====================");
            System.out.println("Welcome to Minefield!");
            printGameTable(runningGame);
            System.out.print("Enter row number:");
            int rowNumber= input.nextInt()-1;
            System.out.print("Enter column number:");
            int columnNumber= input.nextInt()-1;
            if (gameField[rowNumber][columnNumber].equals("*")){
                System.out.println("Game Over!");
                return;
            }
        }
    }

    void printGameTable(String[][] game){
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                System.out.print(game[i][j]+" ");
            }
            System.out.println();
        }
    }
}



