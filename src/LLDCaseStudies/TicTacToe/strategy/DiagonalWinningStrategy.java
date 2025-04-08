package LLDCaseStudies.TicTacToe.strategy;

import LLDCaseStudies.TicTacToe.models.Board;
import LLDCaseStudies.TicTacToe.models.Cell;
import LLDCaseStudies.TicTacToe.models.Move;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy{

    private HashMap<Pair, HashMap<Character , Integer>> topLeftBottomRightDiagonal = new HashMap<>();
    private HashMap<Pair, HashMap<Character , Integer>> topRightBottomLeftDiagonal = new HashMap<>();

    @Override
    public boolean checkWinner(Move move, Board board) {
        Cell cell = move.getCell();
        int row = cell.getRow();
        int column = cell.getColumn();
        boolean tlbrDiagonal = false;
        boolean trblDiagonal = false;
        if(row == column){
            tlbrDiagonal = checkWinnerInTopLeftDiagonal(cell, board);
        }
        if(row + column == board.getSize() - 1){
            trblDiagonal = checkWinnerInTopRightDiagonal(cell, board);
        }

        if(tlbrDiagonal || trblDiagonal){
            return true;
        }

        return false;
    }

    private boolean checkWinnerInTopLeftDiagonal(Cell cell, Board board){
        int row = cell.getRow();
        int column = cell.getColumn();

        Pair pair = new Pair(row, column);
        if(!topLeftBottomRightDiagonal.containsKey(pair)){
            topLeftBottomRightDiagonal.put(pair, new HashMap<>());
        }
        HashMap<Character , Integer> counts = topLeftBottomRightDiagonal.get(pair);

        // check if freq of symbol is present or not
        if(!counts.containsKey(cell.getSymbol().getSymbol())){
            counts.put(cell.getSymbol().getSymbol(), 0);
        }
        // increase the frequency
        counts.put(cell.getSymbol().getSymbol(), counts.get(cell.getSymbol().getSymbol()) + 1);

        if(counts.get(cell.getSymbol().getSymbol()) == board.getSize()){
            return true;
        }
        return false;
    }

    private boolean checkWinnerInTopRightDiagonal(Cell cell, Board board){
        int row = cell.getRow();
        int column = cell.getColumn();

        Pair pair = new Pair(row, column);
        if(!topRightBottomLeftDiagonal.containsKey(pair)){
            topRightBottomLeftDiagonal.put(pair, new HashMap<>());
        }
        HashMap<Character , Integer> counts = topRightBottomLeftDiagonal.get(pair);

        // check if freq of symbol is present or not
        if(!counts.containsKey(cell.getSymbol().getSymbol())){
            counts.put(cell.getSymbol().getSymbol(), 0);
        }
        // increase the frequency
        counts.put(cell.getSymbol().getSymbol(), counts.get(cell.getSymbol().getSymbol()) + 1);

        if(counts.get(cell.getSymbol().getSymbol()) == board.getSize()){
            return true;
        }
        return false;
    }

//    private void createTLBRDiagonal(int size){
//        for(int i = 0; i < size; i++){
//            for(int j = 0; j < size; j++){
//                if(i == j)
//                    topLeftBottomRightDiagonal.put(new Pair(i, j), new HashMap<>());
//            }
//        }
//    }
//
//    private void createTRBLDiagonal(int size){
//        for(int i = 0; i < size; i++){
//            for(int j = 0; j < size; j++){
//                if(i + j == size - 1)
//                    topRightBottomLeftDiagonal.put(new Pair(i, j), new HashMap<>());
//            }
//        }
//    }

    @Override
    public void handleUndo(Move move, Board board) {

    }

    class Pair{
        int dRow;
        int dCol;

        public Pair(int dRow, int dCol){
            this.dRow = dRow;
            this.dCol = dCol;
        }
    }
}
