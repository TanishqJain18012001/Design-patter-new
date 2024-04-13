package org.example;

public class ChessGame implements Game {
    private LeaderboardManager leaderboardManager;

    public ChessGame(LeaderboardManager leaderboardManager) {
        this.leaderboardManager = leaderboardManager;
    }

    @Override
    public void play() {
        System.out.println("Playing chess...");
        leaderboardManager.addScore("ChessPlayer", 50);
        leaderboardManager.printLeaderboard();
    }
}
