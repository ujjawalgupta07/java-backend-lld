package LLDCaseStudies.TicTacToe.factory;

import LLDCaseStudies.TicTacToe.enums.BotPlayingDifficultyLevels;
import LLDCaseStudies.TicTacToe.strategy.botPlayingStrategy.BotPlayingStrategy;
import LLDCaseStudies.TicTacToe.strategy.botPlayingStrategy.EasyBotPlayingStrategy;
import LLDCaseStudies.TicTacToe.strategy.botPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotPlayingDifficultyLevels botDifficultyLevel){
        if(botDifficultyLevel.equals(BotPlayingDifficultyLevels.EASY)){
            return new EasyBotPlayingStrategy();
        }
        else if(botDifficultyLevel.equals(BotPlayingDifficultyLevels.MEDIUM)){
            return new RandomBotPlayingStrategy();
        }

        return null;

    }
}
