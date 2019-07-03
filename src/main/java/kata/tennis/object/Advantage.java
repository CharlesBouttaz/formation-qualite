package kata.tennis.object;

public class Advantage implements GameScore {
    private Player player;

    public Advantage(Player player) {
        this.player = player;
    }

    @Override
    public GameScore nextScore(Player player) {
        if (player == this.player)
            return new Winner(player);
        return new Deuce();
    }

    @Override
    public String getScore() {
        return "Advantage " + player.toString();
    }
}
