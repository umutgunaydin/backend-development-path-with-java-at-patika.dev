package java101.minefieldProject;

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
        int mines=0;

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j <gameField[i].length; j++) {
                int random= (int) (Math.random() * 10);
                if (random>=7&&mines<numberOfMines){
                    gameField[i][j]="*";
                    locationOfMines[mines][0]=i;
                    locationOfMines[mines][1]=j;
                    mines++;
                }else{
                    gameField[i][j]="-";
                }
            }
        }
    }

    public void run(){
        System.out.println("Location Of Mines:");
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j]+" ");
            }
            System.out.println();
        }
    }
}



