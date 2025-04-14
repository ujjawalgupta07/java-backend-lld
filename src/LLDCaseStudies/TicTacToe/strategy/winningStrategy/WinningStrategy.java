package LLDCaseStudies.TicTacToe.strategy.winningStrategy;

import LLDCaseStudies.TicTacToe.entity.Game;
import LLDCaseStudies.TicTacToe.entity.Move;

public interface WinningStrategy {

    boolean checkWinner(Game game, Move move);
}
