package LLDCaseStudies.TicTacToe.models;

import LLDCaseStudies.TicTacToe.enums.PlayerType;

public class Human extends Player {

    private int level;
    private int coins;

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

}
