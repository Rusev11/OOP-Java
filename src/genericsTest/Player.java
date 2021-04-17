package genericsTest;

public class Player <T extends Game> {
    private String name;
    private int height;

    public Player(String name, int height) {
        this.name = name;
        this.height = height;
    }


}
