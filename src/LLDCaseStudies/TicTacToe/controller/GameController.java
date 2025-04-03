package LLDCaseStudies.TicTacToe.controller;

import LLDCaseStudies.TicTacToe.enums.*;
import LLDCaseStudies.TicTacToe.models.*;
import java.util.List;
import java.util.Scanner;

public class GameController {

    public Game createGame(int gridSize, List<Player> players){
        Board board = new Board(gridSize);
        Game game = new Game(board, players);
        System.out.println("The game lobby has been created");
        return game;
    }

    public Game startGame(Game game) {
        System.out.println("Game has started");
        game.setGameState(GameState.IN_PROGRESS);
        return game;
    }

    public Game makeMove(Game game, Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Row you want to enter your symbol :: " + player.getSymbol().getSymbol());
        int row = scanner.nextInt();
        System.out.println("Enter the Column you want to enter your symbol :: ");
        int col = scanner.nextInt();
        Cell cell = new Cell(row, col, player);
        Move move = new Move(player,cell);
        List<Move> moves = game.getGameMoves();
        moves.add(move);
        Board board = game.getBoard();
        board.addCellToBoard(cell);
        displayBoard(game);
        return game;
    }

    public void displayBoard(Game game) {
        Board board = game.getBoard();
        List<List<Cell>> grid = board.getGrid();
        for(int i = 0; i < grid.size(); i++){
            for(int j = 0; j < grid.get(i).size(); j++){
                Cell cell = grid.get(i).get(j);
                Symbol symbol = cell.getSymbol();
                System.out.print(symbol != null ? symbol.getSymbol() : " ");
                if(j != board.getSize() - 1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i != board.getSize()-1){
                System.out.println("----------------");
            }
        }
    }

    public GameState checkGameState(Game game) {
        return game.getGameState();
    }

}
