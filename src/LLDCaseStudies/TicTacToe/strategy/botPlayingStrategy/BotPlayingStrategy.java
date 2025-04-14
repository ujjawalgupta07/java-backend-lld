package LLDCaseStudies.TicTacToe.strategy.botPlayingStrategy;

import LLDCaseStudies.TicTacToe.entity.Board;
import LLDCaseStudies.TicTacToe.entity.Move;
import LLDCaseStudies.TicTacToe.entity.Player;

public interface BotPlayingStrategy {

    public Move makeMoveForBot(Board board, Player player);
}
