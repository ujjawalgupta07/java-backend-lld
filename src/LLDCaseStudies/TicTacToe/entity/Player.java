package LLDCaseStudies.TicTacToe.entity;

import LLDCaseStudies.TicTacToe.enums.PlayerTypes;

public abstract class Player {

    private String name;
    private Symbol symbol;
    private PlayerTypes playerType;

    public Player(String name, Symbol symbol, PlayerTypes type) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerTypes playerType) {
        this.playerType = playerType;
    }
}
