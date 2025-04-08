package LLDCaseStudies.TicTacToe.models;

import LLDCaseStudies.TicTacToe.enums.PlayerType;

import java.util.Scanner;

public class Human extends Player {

    private int level;
    private int coins;
    Scanner sc = new Scanner(System.in);

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Human(String name, Symbol symbol, PlayerType playerType) {
        super(name, symbol, playerType);
    }

    @Override
    public Move makeMove() {
        System.out.println("Please enter the row in which you would like to make a move");
        int row = sc.nextInt();
        System.out.println("Please enter the column in which you would like to make a move");
        int column = sc.nextInt();

        return new Move(this, new Cell(row , column));
    }

}
