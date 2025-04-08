package LLDCaseStudies.TicTacToe.models;


import LLDCaseStudies.TicTacToe.enums.*;

public class Bot extends Player {

    private BotDifficulty difficultyLevel;

    public BotDifficulty getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotDifficulty difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Bot(String name, Symbol symbol, PlayerType playerType, BotDifficulty difficultyLevel) {
        super(name, symbol, playerType);
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public Move makeMove() {
        return null;
    }
}
