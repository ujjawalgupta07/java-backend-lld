package LLDCaseStudies.TicTacToe.strategy.winningStrategy;

import LLDCaseStudies.TicTacToe.entity.Board;
import LLDCaseStudies.TicTacToe.entity.Game;
import LLDCaseStudies.TicTacToe.entity.Move;
import LLDCaseStudies.TicTacToe.entity.Cell;
import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy {

    HashMap<Integer, HashMap<String, Integer>> colCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Game game, Move lastMove) {

        Board board = game.getBoard();
        Cell cell = lastMove.getCell();
        int col = cell.getCol();
        // check if information about the row is present or not
        if(!colCounts.containsKey(col)){
            colCounts.put(col, new HashMap<>());
        }
        HashMap<String , Integer> counts = colCounts.get(col);

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

