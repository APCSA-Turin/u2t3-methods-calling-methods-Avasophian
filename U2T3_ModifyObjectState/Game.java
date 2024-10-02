package U2T3_ModifyObjectState;

public class Game
 {

    private String gameName;
    private int players;
    private int score;

    public Game(String gameName, int players)
    {
        this.gameName = gameName;
        this.players = players;
    }

    public String getName()
    {
        return gameName;
    }
    public int getPlayers()
    {
        return players;
    }
    public int getScore()
    {
        return score;
    }
    public void addPlayer()
    {
        players ++;
    }
    public void increaseScore(int increase)
    {
        score += increase;
    }
    public double averageScorePerPlayer()
    {
        return (((double)score)/((double)players));
    }
    public boolean isGameOver()
    {
        if (score > 9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
