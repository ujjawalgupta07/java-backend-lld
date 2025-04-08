package LLDCaseStudies.TicTacToe.strategy;

import LLDCaseStudies.TicTacToe.models.Board;
import LLDCaseStudies.TicTacToe.models.Cell;
import LLDCaseStudies.TicTacToe.models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {

    private HashMap<Integer , HashMap<Character , Integer>> rowCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Move move, Board board) {
        Cell cell = move.getCell();
        int row = cell.getRow();
        // check if information about the row is present or not
        if(!rowCounts.containsKey(row)){
            rowCounts.put(row, new HashMap<>());
        }
        HashMap<Character , Integer> counts = rowCounts.get(row);

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
        int row = move.getCell().getRow();
        Character ch = move.getPlayer().getSymbol().getSymbol();

        rowCounts.get(row).put(ch, rowCounts.get(row).get(ch) - 1);
    }

}
