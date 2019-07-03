package kata.tennis.object;

public class Winner implements GameScore {
    private Player player;

    public Winner(Player player) {
        this.player = player;
    }

    @Override
    public GameScore nextScore(Player player) {
        return null;
    }

    @Override
    public String getScore() {
        return "Game " + player.toString();
    }
}
