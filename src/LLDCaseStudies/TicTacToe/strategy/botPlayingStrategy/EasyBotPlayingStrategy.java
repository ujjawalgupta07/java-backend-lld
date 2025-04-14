package LLDCaseStudies.TicTacToe.strategy.botPlayingStrategy;

import LLDCaseStudies.TicTacToe.entity.*;
import LLDCaseStudies.TicTacToe.enums.CellStates;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeMoveForBot(Board board, Player player) {
        List<List<Cell>> grid = board.getGrid();

        for(int i = 0 ; i < board.getSize(); i++){
            for (int j = 0 ; j < board.getSize(); j++){
                Cell cell = grid.get(i).get(j);
                if(cell.getState().equals(CellStates.EMPTY)){
                    return new Move(player, new Cell(i, j));
                }
            }
        }
        return null;
    }
}