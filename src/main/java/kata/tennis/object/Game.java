package kata.tennis.object;

public class Game {

    private GameScore gameScore = new FirstPoints(Score.Love, Score.Love);

    public String getScore() {
        return gameScore.getScore();
    }

    public void scorePoint(Player player) {
        gameScore = gameScore.nextScore(player);
    }
}
