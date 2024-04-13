package org.example;

public class Main {
    public static void main(String[] args) {
        LeaderboardManager leaderboardManager = LeaderboardManager.getInstance();

        Game chessGame = GameFactory.createGame("chess", leaderboardManager);
        chessGame.play();

        Game sudokuGame = GameFactory.createGame("sudoku", leaderboardManager);
        sudokuGame.play();
    }
}
