package kata.tennis.object;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameShould {
    @Test
    public void returnLoveLoveWhenNoPoints(){
        // Actors
        Game game = new Game();

        // Action
        String score = game.getScore();

        // Asserts
        assertEquals("Love-Love", score);
    }

    @Test
    public void return15LoveWhenNoPoints(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P1);
        String score = game.getScore();

        // Asserts
        assertEquals("15-Love", score);
    }

    @Test
    public void returnLove15WhenNoPoints(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P2);
        String score = game.getScore();

        // Asserts
        assertEquals("Love-15", score);
    }

    @Test
    public void returnLove30WhenNoPoints(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P2);
        String score = game.getScore();

        // Asserts
        assertEquals("Love-30", score);
    }

    @Test
    public void return40_15(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P1);
        String score = game.getScore();

        // Asserts
        assertEquals("40-15", score);
    }

    @Test
    public void returnDeuce(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P2);
        String score = game.getScore();

        // Asserts
        assertEquals("Deuce", score);
    }

    @Test
    public void returnAvantagePlayer1(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        String score = game.getScore();

        // Asserts
        assertEquals("Advantage P1", score);
    }

    @Test
    public void returnGamePlayer1(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P1);
        String score = game.getScore();

        // Asserts
    assertEquals("Game P1", score);
    }

    @Test
    public void returnGamePlayer2(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P2);
        String score = game.getScore();

        // Asserts
        assertEquals("Game P2", score);
    }

    @Test
    public void returnGameAfterAvantagePlayer1(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P1);
        String score = game.getScore();

        // Asserts
        assertEquals("Game P1", score);
    }

    @Test
    public void returnDeuceAfterAvantagePlayer1(){
        // Actors
        Game game = new Game();

        // Action
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P2);
        game.scorePoint(Player.P1);
        game.scorePoint(Player.P2);
        String score = game.getScore();

        // Asserts
        assertEquals("Deuce", score);
    }
}
