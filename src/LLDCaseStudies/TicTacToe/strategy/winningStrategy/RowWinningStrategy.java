package LLDCaseStudies.TicTacToe.strategy.winningStrategy;

import LLDCaseStudies.TicTacToe.entity.*;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {

    HashMap<Integer, HashMap<String, Integer>> rowCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Game game, Move lastMove) {

        Board board = game.getBoard();
         Cell cell = lastMove.getCell();
        int row = cell.getRow();
        // check if information about the row is present or not
        if(!rowCounts.containsKey(row)){
            rowCounts.put(row, new HashMap<>());
        }
        HashMap<String , Integer> counts = rowCounts.get(row);

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
}
