package LLDCaseStudies.TicTacToe;

import LLDCaseStudies.TicTacToe.controller.GameController;
import LLDCaseStudies.TicTacToe.entity.Game;
import LLDCaseStudies.TicTacToe.entity.Human;
import LLDCaseStudies.TicTacToe.entity.Player;
import LLDCaseStudies.TicTacToe.entity.Symbol;
import LLDCaseStudies.TicTacToe.enums.GameStates;
import LLDCaseStudies.TicTacToe.enums.PlayerTypes;
import LLDCaseStudies.TicTacToe.service.GameService;
import LLDCaseStudies.TicTacToe.strategy.winningStrategy.ColumnWinningStrategy;
import LLDCaseStudies.TicTacToe.strategy.winningStrategy.CompositeWinningStrategy;
import LLDCaseStudies.TicTacToe.strategy.winningStrategy.RowWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        CompositeWinningStrategy compositeWinningStrategy = new CompositeWinningStrategy();
        compositeWinningStrategy.addStrategy(new RowWinningStrategy());
        compositeWinningStrategy.addStrategy(new ColumnWinningStrategy());

        GameService gameService = new GameService(compositeWinningStrategy);
        GameController gameController = new GameController(gameService);

        List<Player> players = new ArrayList<>();
        players.add(new Human("Ujjawal", new Symbol("U"), PlayerTypes.HUMAN));
        players.add(new Human("Samiksha", new Symbol("S"), PlayerTypes.HUMAN));

        Game game = new Game(3, players);
        gameController.startGame(game);

        while(game.getGameState().equals(GameStates.IN_PROGRESS)){
            gameController.makeMove(game);
            gameController.displayBoard(game);
        }
        if(game.getGameState().equals(GameStates.COMPLETED)){
            System.out.println(game.getWinner().getName() + " has won the game !!!!!");
        }
        else if(game.getGameState().equals(GameStates.DRAW)){
            System.out.println("The game ended in a draw");

        }

    }
}
