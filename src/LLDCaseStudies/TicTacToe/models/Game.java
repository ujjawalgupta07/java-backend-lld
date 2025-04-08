package LLDCaseStudies.TicTacToe.models;


import LLDCaseStudies.TicTacToe.enums.GameState;
import LLDCaseStudies.TicTacToe.strategy.ColumnWinningStrategy;
import LLDCaseStudies.TicTacToe.strategy.DiagonalWinningStrategy;
import LLDCaseStudies.TicTacToe.strategy.RowWinningStrategy;
import LLDCaseStudies.TicTacToe.strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private Player winner;
    private GameState gameState;
    private List<Move> gameMoves;
    private List<WinningStrategy> winningStrategies;
    private int nextPlayerIndex;

    public Game(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
        this.gameMoves = new ArrayList<>();
        this.gameState = GameState.CREATED;
        this.nextPlayerIndex = 0;
        this.winner = null;
        List<WinningStrategy> strategies = new ArrayList<>();
        strategies.add(new RowWinningStrategy());
        strategies.add(new ColumnWinningStrategy());
        strategies.add(new DiagonalWinningStrategy());
        this.winningStrategies = strategies;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getGameMoves() {
        return gameMoves;
    }

    public void setGameMoves(List<Move> gameMoves) {
        this.gameMoves = gameMoves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
