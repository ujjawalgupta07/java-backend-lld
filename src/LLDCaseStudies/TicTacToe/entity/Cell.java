package LLDCaseStudies.TicTacToe.entity;

import LLDCaseStudies.TicTacToe.enums.CellStates;

public class Cell {

    private int row;
    private int col;
    private Symbol symbol;
    private CellStates state;

    public Cell(int row, int col, Symbol symbol) {
        this.row = row;
        this.col = col;
        this.symbol = symbol;
        this.state = CellStates.FILLED;
    }

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        this.state = CellStates.EMPTY;
        this.symbol = new Symbol("");
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public CellStates getState() {
        return state;
    }

    public void setState(CellStates state) {
        this.state = state;
    }
}
