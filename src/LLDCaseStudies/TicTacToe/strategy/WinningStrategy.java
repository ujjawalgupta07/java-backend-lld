package LLDCaseStudies.TicTacToe.strategy;

import LLDCaseStudies.TicTacToe.models.Board;
import LLDCaseStudies.TicTacToe.models.Move;

public interface WinningStrategy {

    boolean checkWinner(Move move, Board board);
    void handleUndo(Move move, Board board);
}
