package LLDCaseStudies.TicTacToe.strategy.winningStrategy;

import LLDCaseStudies.TicTacToe.entity.Game;
import LLDCaseStudies.TicTacToe.entity.Move;

import java.util.ArrayList;
import java.util.List;

public class CompositeWinningStrategy implements WinningStrategy {

    private final List<WinningStrategy> strategies = new ArrayList<>();

    public void addStrategy(WinningStrategy strategy) {
        strategies.add(strategy);
    }

    @Override
    public boolean checkWinner(Game game, Move lastMove) {
        for (WinningStrategy strategy : strategies) {
            if (strategy.checkWinner(game, lastMove))
                return true;
        }
        return false;
    }
}
