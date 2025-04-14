package LLDCaseStudies.TicTacToe.controller;

import LLDCaseStudies.TicTacToe.entity.Game;
import LLDCaseStudies.TicTacToe.service.GameService;

public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    public void startGame(Game game){
        gameService.startGame(game);
    }

    public void makeMove(Game game) {
        gameService.makeMove(game);
    }

    public void displayBoard(Game game) {
        gameService.displayBoard(game.getBoard());
    }
}
