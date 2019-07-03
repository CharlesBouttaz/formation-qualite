package kata.tennis.object;

import java.util.HashMap;
import java.util.Map;

public class FirstPoints implements GameScore {
    public static Map<Score, String> ScorePrint = new HashMap<>();

    public static Map<Score, Score> ScoreEvolution = new HashMap<>();

    private final Score player1;
    private final Score player2;

    private Score scoreP1 = Score.Love;
    private Score scoreP2 = Score.Love;

    public FirstPoints(Score player1, Score player2) {
        this.player1 = player1;
        this.player2 = player2;

        ScorePrint.put(Score.Love, "Love");
        ScorePrint.put(Score.Fifteen, "15");
        ScorePrint.put(Score.Thirty, "30");
        ScorePrint.put(Score.Forty, "40");

        ScoreEvolution.put(Score.Love, Score.Fifteen);
        ScoreEvolution.put(Score.Fifteen, Score.Thirty);
        ScoreEvolution.put(Score.Thirty, Score.Forty);
    }

    @Override
    public GameScore nextScore(Player player) {
        if (scoreP1 == Score.Thirty && player == Player.P1)
            return new Forty(Player.P1, scoreP2);
        if (scoreP2 == Score.Thirty && player == Player.P2)
            return new Forty(Player.P2, scoreP1);
        if (player == Player.P1)
            scoreP1 = ScoreEvolution.get(scoreP1);
        else
            scoreP2 = ScoreEvolution.get(scoreP2);
        return this;
    }

    @Override
    public String getScore() {
        return ScorePrint.get(scoreP1)
            + "-" + ScorePrint.get(scoreP2);
    }
}
