package LLDCaseStudies.TicTacToe.strategy.winningStrategy;

import LLDCaseStudies.TicTacToe.entity.Board;
import LLDCaseStudies.TicTacToe.entity.Cell;
import LLDCaseStudies.TicTacToe.entity.Game;
import LLDCaseStudies.TicTacToe.entity.Move;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy {

    private final HashMap<String , Integer> topLeftBottomRightDiagonal = new HashMap<>();
    private final HashMap<String , Integer> topRightBottomLeftDiagonal = new HashMap<>();

    @Override
    public boolean checkWinner(Game game, Move move) {
        Board board = game.getBoard();
        Cell cell = move.getCell();
        int row = cell.getRow();
        int column = cell.getCol();
        boolean tlbrDiagonal = false;
        boolean trblDiagonal = false;
//        System.out.println("Checking winner in diagonals :::: ");
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

        // check if freq of symbol is present or not
        if(!topLeftBottomRightDiagonal.containsKey(cell.getSymbol().getSymbol())){
            topLeftBottomRightDiagonal.put(cell.getSymbol().getSymbol(), 0);
        }
        // increase the frequency
        topLeftBottomRightDiagonal.put(cell.getSymbol().getSymbol(), topLeftBottomRightDiagonal.get(cell.getSymbol().getSymbol()) + 1);
//        System.out.println(cell.getSymbol().getSymbol() + " ::: " + topLeftBottomRightDiagonal.get(cell.getSymbol().getSymbol()));
        if(topLeftBottomRightDiagonal.get(cell.getSymbol().getSymbol()) == board.getSize()){
            return true;
        }
        return false;
    }

    private boolean checkWinnerInTopRightDiagonal(Cell cell, Board board){
        // check if freq of symbol is present or not
        if(!topRightBottomLeftDiagonal.containsKey(cell.getSymbol().getSymbol())){
            topRightBottomLeftDiagonal.put(cell.getSymbol().getSymbol(), 0);
        }
        // increase the frequency
        topRightBottomLeftDiagonal.put(cell.getSymbol().getSymbol(), topRightBottomLeftDiagonal.get(cell.getSymbol().getSymbol()) + 1);

        if(topRightBottomLeftDiagonal.get(cell.getSymbol().getSymbol()) == board.getSize()){
            return true;
        }
        return false;
    }

}
