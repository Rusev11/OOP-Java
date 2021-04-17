package genericsTest;

import java.util.List;

public class Team <T extends Game>{
    private List<Player<T>> squad;

    public void addPlayer (Player<T> player){
        squad.add(player);
    }

    public List<Player<T>> getSquad (){
        return squad;
    }
}
