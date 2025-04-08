package LLDCaseStudies.TicTacToe;


import LLDCaseStudies.TicTacToe.controller.GameController;
import LLDCaseStudies.TicTacToe.enums.BotDifficulty;
import LLDCaseStudies.TicTacToe.enums.GameState;
import LLDCaseStudies.TicTacToe.enums.PlayerType;
import LLDCaseStudies.TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        System.out.println("Play with another player or play with bot??");
        System.out.println("Press 1 for human");
        System.out.println("Press 2 for computer");
        int userInput = sc.nextInt();
        if(userInput == 1){
            System.out.println("Enter the number of players: ");
            int numberOfPlayers = sc.nextInt();
            for(int i = 0; i < numberOfPlayers; i++){
                System.out.println("Enter the name of the player: ");
                String name = sc.next();
                System.out.println("Enter the symbol of the player: ");
                char symbol = sc.next().charAt(0);
                players.add(new Human(name, new Symbol(symbol), PlayerType.HUMAN));
            }
        }
        else if(userInput == 2){
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter your symbol: ");
            char symbol = sc.next().charAt(0);
            players.add(new Human(name, new Symbol(symbol), PlayerType.HUMAN));
            players.add(new Bot("Botty", new Symbol('B'), PlayerType.BOT, BotDifficulty.EASY));
        }

        System.out.println("Enter the Board size :: ");
        int gridSize = sc.nextInt();

        Game game = gameController.createGame(gridSize, players);
        gameController.startGame(game);

        while(game.getGameState().equals(GameState.IN_PROGRESS)){
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }

        if(gameController.checkGameState(game).equals(GameState.SUCCESS)){
            System.out.println("We have a winner : " + game.getWinner().getName());
        } else if(gameController.checkGameState(game).equals(GameState.DRAW)){
            System.out.println("Game ends in DRAW!");
        }

    }
}
