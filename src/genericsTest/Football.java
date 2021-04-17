package genericsTest;

public class Football <T extends Player> extends Game {
    private int gameDuration;

    public Football(int gameDuration) {
        this.gameDuration = gameDuration;
    }
}
