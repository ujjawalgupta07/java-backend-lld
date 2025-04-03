package LLDCaseStudies.TicTacToe.models;


import LLDCaseStudies.TicTacToe.enums.GameState;
import java.util.ArrayList;
import java.util.List;

public class Game {

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

    private Board board;
    private List<Player> players;
    private Player winner;
    private GameState gameState;
    private List<Move> gameMoves;

    public Game(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
        this.gameMoves = new ArrayList<>();
        this.gameState = GameState.CREATED;
    }

}
