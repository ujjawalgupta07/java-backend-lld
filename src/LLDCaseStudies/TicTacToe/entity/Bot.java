package LLDCaseStudies.TicTacToe.entity;

import LLDCaseStudies.TicTacToe.enums.BotPlayingDifficultyLevels;
import LLDCaseStudies.TicTacToe.enums.PlayerTypes;

public class Bot extends Player{

    private BotPlayingDifficultyLevels difficultyLevel;

    public Bot(String name, Symbol symbol, BotPlayingDifficultyLevels difficultyLevel, PlayerTypes playerType) {
        super(name, symbol, playerType);
        this.difficultyLevel = difficultyLevel;
    }

    public BotPlayingDifficultyLevels getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotPlayingDifficultyLevels difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
