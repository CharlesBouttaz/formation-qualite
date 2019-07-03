package kata.tennis.object;

public class Deuce implements GameScore {
    @Override
    public GameScore nextScore(Player player) {
        return new Advantage(player);
    }

    @Override
    public String getScore() {
        return "Deuce";
    }
}
