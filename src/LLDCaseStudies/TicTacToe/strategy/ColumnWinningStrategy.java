package LLDCaseStudies.TicTacToe.strategy;

import LLDCaseStudies.TicTacToe.models.Board;
import LLDCaseStudies.TicTacToe.models.Cell;
import LLDCaseStudies.TicTacToe.models.Move;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy{
    private HashMap<Integer , HashMap<Character , Integer>> colCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Move move, Board board) {
        Cell cell = move.getCell();
        int col = cell.getColumn();
        // check if information about the row is present or not
        if(!colCounts.containsKey(col)){
            colCounts.put(col, new HashMap<>());
        }
        HashMap<Character , Integer> counts = colCounts.get(col);

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

    @Override
    public void handleUndo(Move move, Board board) {

    }
}
