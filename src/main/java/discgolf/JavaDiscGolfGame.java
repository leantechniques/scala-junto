package discgolf;

import java.util.List;

public class JavaDiscGolfGame {

    public static String score(int numberOfThrows, int par) {
        return (numberOfThrows > par ? "+" : "-") + Math.abs(par - numberOfThrows);
    }

    public static String scoreGame(List<Hole> holes) {
        int runningScore = 0;
        int totalPar = 0;
        for (Hole hole : holes) {
            runningScore += hole.getNumberOfThrows();
            totalPar += hole.getPar();
        }

        return score(runningScore, totalPar);
    }
}
