package org.example;

public class GameFactory {
    public static Game createGame(String type, LeaderboardManager leaderboardManager) {
        switch (type.toLowerCase()) {
            case "chess":
                return new ChessGame(leaderboardManager);
            case "sudoku":
                return new SudokuGame(leaderboardManager);
            default:
                throw new IllegalArgumentException("Invalid game type: " + type);
        }
    }
}
