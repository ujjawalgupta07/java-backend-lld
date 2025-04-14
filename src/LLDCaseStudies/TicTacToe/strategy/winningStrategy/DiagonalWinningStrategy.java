package LLDCaseStudies.TicTacToe.strategy.winningStrategy;

import LLDCaseStudies.TicTacToe.entity.Board;
import LLDCaseStudies.TicTacToe.entity.Cell;
import LLDCaseStudies.TicTacToe.entity.Game;
import LLDCaseStudies.TicTacToe.entity.Move;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy {

    private final HashMap<Pair, HashMap<String , Integer>> topLeftBottomRightDiagonal = new HashMap<>();
    private final HashMap<Pair, HashMap<String , Integer>> topRightBottomLeftDiagonal = new HashMap<>();

    @Override
    public boolean checkWinner(Game game, Move move) {
        Board board = game.getBoard();
        Cell cell = move.getCell();
        int row = cell.getRow();
        int column = cell.getCol();
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
        int column = cell.getCol();

        Pair pair = new Pair(row, column);
        if(!topLeftBottomRightDiagonal.containsKey(pair)){
            topLeftBottomRightDiagonal.put(pair, new HashMap<>());
        }
        HashMap<String , Integer> counts = topLeftBottomRightDiagonal.get(pair);

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
        int column = cell.getCol();

        Pair pair = new Pair(row, column);
        if(!topRightBottomLeftDiagonal.containsKey(pair)){
            topRightBottomLeftDiagonal.put(pair, new HashMap<>());
        }
        HashMap<String , Integer> counts = topRightBottomLeftDiagonal.get(pair);

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

    class Pair{
        int dRow;
        int dCol;

        public Pair(int dRow, int dCol){
            this.dRow = dRow;
            this.dCol = dCol;
        }
    }
}
