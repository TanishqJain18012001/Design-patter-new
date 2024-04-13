package org.example;

public class Main {
    public static void main(String[] args) {
        LeaderboardManager leaderboardManager = LeaderboardManager.getInstance();

        leaderboardManager.addScore("Player1", 100);
        leaderboardManager.addScore("Player2", 150);
        leaderboardManager.addScore("Player3", 50);

        leaderboardManager.printLeaderboard();

        int player1Score = leaderboardManager.getScore("Player1");
        System.out.println("Player1's score: " + player1Score);
    }
}
