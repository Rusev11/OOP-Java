package genericsTest;

public class Main {
    public static void main(String[] args) {
        Player<Football> player1 = new Player<>("Ivan", 190);
        Player<Basketball> player2 = new Player<>("Pesho", 202);

        Team<Football> levski = new Team<>();
        levski.addPlayer(player1);

        Team<Basketball> cska = new Team<>();
        cska.addPlayer(player2);
    }
}
