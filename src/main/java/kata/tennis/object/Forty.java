package kata.tennis.object;

public class Forty implements GameScore {
    private Player player;
    private Score otherPlayerScore;

    public Forty(Player player, Score otherPlayerScore) {
        this.player = player;
        this.otherPlayerScore = otherPlayerScore;
    }

    @Override
    public GameScore nextScore(Player player) {
        if (player == this.player)
            return new Winner(player);
        if (otherPlayerScore == Score.Thirty)
            return new Deuce();
        otherPlayerScore = FirstPoints.ScoreEvolution.get(otherPlayerScore);
        return this;
    }

    @Override
    public String getScore() {
        if (player == Player.P1)
            return "40-" + FirstPoints.ScorePrint.get(otherPlayerScore);
        return otherPlayerScore + "-40";
    }
}
