package LLDCaseStudies.TicTacToe.entity;

import LLDCaseStudies.TicTacToe.enums.GameStates;

import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private GameStates gameState;
    private int nextPlayerIndex;
    private Player winner;

    public Game(int size, List<Player> players) {

        this.board = new Board(size);
        this.players = players;
        this.gameState = GameStates.CREATED;
        this.nextPlayerIndex = 0;
        this.winner = null;
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

    public GameStates getGameState() {
        return gameState;
    }

    public void setGameState(GameStates gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
