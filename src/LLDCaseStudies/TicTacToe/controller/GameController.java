package LLDCaseStudies.TicTacToe.controller;

import LLDCaseStudies.TicTacToe.enums.*;
import LLDCaseStudies.TicTacToe.models.*;
import LLDCaseStudies.TicTacToe.strategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(int gridSize, List<Player> players){
        Board board = new Board(gridSize);
        Game game = new Game(board, players);
        System.out.println("The game lobby has been created");
        return game;
    }

    public void startGame(Game game) {
        System.out.println("Game has started");
        game.setGameState(GameState.IN_PROGRESS);
    }

    public void makeMove(Game game) {
        Player currPlayer = game.getPlayers().get(game.getNextPlayerIndex());
        System.out.println("It's " + currPlayer.getName() + "'s turn. Please be ready with your move!");
        Move move = currPlayer.makeMove();

        if(!validateMove(game, move)){
            System.out.println("Invalid Move! Please try again!");
            return;
        }
        changeGameState(game, move);
        if(checkWinner(game, move)){
            game.setWinner(move.getPlayer());
            game.setGameState(GameState.SUCCESS);
        } else if (checkDraw(game)){
            game.setGameState(GameState.DRAW);
        }
    }

    public boolean checkWinner(Game game, Move move){
        for(WinningStrategy winningStrategy : game.getWinningStrategies()){
            if(winningStrategy.checkWinner(move,game.getBoard())){
                return true;
            }
        }
        return false;
    }

    public boolean checkDraw(Game game){
        return game.getGameMoves().size() == game.getBoard().getSize() * game.getBoard().getSize();
    }

    public boolean validateMove(Game game, Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();

        if(row < 0 || row >= game.getBoard().getSize() || col < 0 || col >= game.getBoard().getSize()){
            return false;
        }

        return game.getBoard().getGrid().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }

    public void changeGameState(Game game, Move move) {
        Board board = game.getBoard();
        board.addCellToBoard(move.getCell());

        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();

        Cell cellToChange = board.getGrid().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(move.getPlayer().getSymbol());

        move.setCell(cellToChange);
        game.getGameMoves().add(move);

        int nextPlayerIndex = game.getNextPlayerIndex();
        nextPlayerIndex++;
        game.setNextPlayerIndex(nextPlayerIndex % game.getPlayers().size());

    }

    public void displayBoard(Game game) {
        Board board = game.getBoard();
        board.displayBoard();
    }

    public GameState checkGameState(Game game) {
        return game.getGameState();
    }

}
