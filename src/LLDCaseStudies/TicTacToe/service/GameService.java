package LLDCaseStudies.TicTacToe.service;

import LLDCaseStudies.TicTacToe.entity.*;
import LLDCaseStudies.TicTacToe.enums.CellStates;
import LLDCaseStudies.TicTacToe.enums.GameStates;
import LLDCaseStudies.TicTacToe.strategy.winningStrategy.CompositeWinningStrategy;

import java.util.List;
import java.util.Scanner;

public class GameService {

    Scanner sc = new Scanner(System.in);
    CompositeWinningStrategy compositeWinningStrategy;

    public GameService(CompositeWinningStrategy compositeWinningStrategy) {
        this.compositeWinningStrategy = compositeWinningStrategy;
    }

    public void startGame(Game game){
        game.setGameState(GameStates.IN_PROGRESS);
        Board board = game.getBoard();
        displayBoard(board);
    }

    public void displayBoard(Board board){
        List<List<Cell>> grid = board.getGrid();
        for(List<Cell> row : grid){
            System.out.print(" | ");
            for(Cell cell : row){
                displayCell(cell);
                System.out.print(" | ");
            }
            System.out.println(" ");
            System.out.println("---------------");
        }
    }

    public void displayCell(Cell cell) {
        Symbol symbol = cell.getSymbol();
        System.out.print(symbol.getSymbol() + " ");
    }

    public void makeMove(Game game){
        Player player = game.getPlayers().get(game.getNextPlayerIndex() % game.getPlayers().size());
        System.out.println("It's " + player.getName() + "'s turn. Please be ready with your move.");
        System.out.println("Enter the row you want to make move : ");
        int row = sc.nextInt();
        System.out.println("Enter the column you want to make move : ");
        int column = sc.nextInt();
        if(!isValidMove(game, row, column)){
            System.out.println("Invalid move !!!! Please try again.");
            return;
        }
        Move move = new Move(player, new Cell(row, column, player.getSymbol()));
        changeBoardState(game, move);

        if(checkWinner(game, move)){
            game.setGameState(GameStates.COMPLETED);
            game.setWinner(player);
            return;
        }

        changeGameState(game);

    }

    private boolean checkWinner(Game game, Move lastMove) {
        return compositeWinningStrategy.checkWinner(game, lastMove);
    }

    private void changeGameState(Game game) {

        if(game.getBoard().getEmptyCells() == 0 && game.getWinner() == null){
            game.setGameState(GameStates.DRAW);
            return;
        }

        game.setNextPlayerIndex(game.getNextPlayerIndex() + 1 % game.getPlayers().size());

    }

    private boolean isValidMove(Game game, int row, int column) {
        int size = game.getBoard().getSize();

        return row >= 0 && column >= 0 && row < size && column < size &&
                game.getBoard().getGrid().get(row).get(column).getState().equals(CellStates.EMPTY);
    }

    private void changeBoardState(Game game, Move move) {
        Board board = game.getBoard();
        board.getMoves().add(move);
        board.setEmptyCells(board.getEmptyCells() - 1);
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getCell().getSymbol();
        board.getGrid().get(row).get(col).setSymbol(symbol);
        board.getGrid().get(row).get(col).setState(CellStates.FILLED);
    }


}
