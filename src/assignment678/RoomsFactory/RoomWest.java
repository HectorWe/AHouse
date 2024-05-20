package assignment678.RoomsFactory;

import assignment678.Exitable;
import assignment678.Interactable;
import assignment678.LootsStrategy.NoLoot;
import assignment678.Player;

public class RoomWest extends Room implements Interactable, Exitable {

    public RoomWest() {
        super("The Alchemist's Room.", new NoLoot());
    }

    public String getExits(){
        return "East";
    }

    @Override
    public String getDescription() {
        return "You can see many books and a pile of leaves on the ground with alchemy texts.";
    }

    @Override
    public String exit(Player player) {
        player.addToScore(100);
        return "Congratulations!!";
    }

    @Override
    public String interact(Player player) {
        player.addToScore(10);
        return "You have stepped on a loose floor tile that has opened a door to the outside.\nYou can go outside if you want!\n10 POINTS";
    }

}
