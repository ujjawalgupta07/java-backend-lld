package LLDCaseStudies.TicTacToe;


import LLDCaseStudies.TicTacToe.controller.GameController;
import LLDCaseStudies.TicTacToe.enums.*;
import LLDCaseStudies.TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(new Human("Ujjawal", new Symbol('U'), PlayerType.HUMAN));
        players.add(new Human("Samiksha", new Symbol('S'), PlayerType.HUMAN));
        Game game = gameController.createGame(3, players);

        game = gameController.startGame(game);

        while(game.getGameState().equals(GameState.IN_PROGRESS)){
            gameController.makeMove(game, players.get(0));
        }

    }
}
