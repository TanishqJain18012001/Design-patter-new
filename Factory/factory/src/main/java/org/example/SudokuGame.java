package org.example;

public class SudokuGame implements Game {
    private LeaderboardManager leaderboardManager;

    public SudokuGame(LeaderboardManager leaderboardManager) {
        this.leaderboardManager = leaderboardManager;
    }

    @Override
    public void play() {
        System.out.println("Playing sudoku...");
        leaderboardManager.addScore("SudokuPlayer", 30);
        leaderboardManager.printLeaderboard();
    }
}

