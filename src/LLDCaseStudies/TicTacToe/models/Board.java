package LLDCaseStudies.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private List<List<Cell>> grid = new ArrayList<>();

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

    public Board(int size) {
        this.size = size;
        this.grid = createGrid();
    }

    public List<List<Cell>> createGrid(){
        List<List<Cell>> grid = new ArrayList<>();

        for(int i = 0; i < size; i++){
            List<Cell> cells = new ArrayList<>();
            for(int j = 0; j < size; j++){
                cells.add(new Cell(i,j));
            }
            grid.add(cells);
        }
        return grid;
    }

    public void addCellToBoard(Cell cell){
        int row = cell.getRow();
        int column = cell.getColumn();

        grid.get(row).set(column, cell);
    }

    public void displayBoard(){
        List<List<Cell>> grid = this.grid;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Cell cell = grid.get(i).get(j);
                cell.displayCell();
                if(j != size - 1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i != size - 1){
                System.out.println("----------------");
            }
        }
    }

}
