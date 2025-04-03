package LLDCaseStudies.TicTacToe.models;


public class Cell {

    private int row;
    private int column;
    private Symbol symbol;
    private Player player;

    public Cell(int row, int column, Player player) {
        this(row, column);
        this.player = player;
        this.symbol = player.getSymbol();
    }

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
