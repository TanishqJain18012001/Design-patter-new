package org.example;

import java.util.HashMap;
import java.util.Map;

public class LeaderboardManager {
    private static LeaderboardManager instance;
    private Map<String, Integer> leaderboard;

    private LeaderboardManager() {
        // Private constructor to prevent instantiation
        leaderboard = new HashMap<>();
    }

    public static synchronized LeaderboardManager getInstance() {
        if (instance == null) {
            instance = new LeaderboardManager();
        }
        return instance;
    }

    public void addScore(String playerName, int score) {
        if (leaderboard.containsKey(playerName)) {
            leaderboard.put(playerName, leaderboard.get(playerName) + score);
        } else {
            leaderboard.put(playerName, score);
        }
    }

    public int getScore(String playerName) {
        return leaderboard.getOrDefault(playerName, 0);
    }

    public void printLeaderboard() {
        System.out.println("Leaderboard:");
        leaderboard.forEach((player, score) -> System.out.println(player + ": " + score));
    }
}
