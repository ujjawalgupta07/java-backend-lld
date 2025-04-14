package LLDCaseStudies.TicTacToe.entity;

import java.util.ArrayList;
import java.util.List;

public class Board {
    
    private List<List<Cell>> grid;
    private int size;
    private List<Move> moves;
    private int emptyCells;

    public Board(int size) {
        
        this.grid = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            this.grid.add(new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.grid.get(i).add(new Cell(i, j));
            }
        }
        this.size = size;
        this.moves = new ArrayList<>();
        this.emptyCells = size * size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getEmptyCells() {
        return emptyCells;
    }

    public void setEmptyCells(int emptyCells) {
        this.emptyCells = emptyCells;
    }
}
