package LLDCaseStudies.TicTacToe.models;


import LLDCaseStudies.TicTacToe.enums.CellState;

public class Cell {

    private int row;
    private int column;
    private Symbol symbol;
    private Player player;
    private CellState cellState;

    public Cell(int row, int column, Player player) {
        this(row, column);
        this.player = player;
        this.symbol = player.getSymbol();
    }

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.symbol = new Symbol(Character.MIN_VALUE);
        this.player = null;
        this.cellState = CellState.EMPTY;

    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
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

    public void displayCell(){
        System.out.print(this.symbol.getSymbol());
    }
}
