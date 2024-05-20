package assignment678.RoomsFactory;

import assignment678.Interactable;
import assignment678.LootsStrategy.NoLoot;
import assignment678.Player;

public class RoomEast extends Room implements Interactable {

    public RoomEast() {
        super("Stair Room", new NoLoot());
    }

    public String getExits(){
        return "West, Up, Down";
    }

    @Override
    public String getDescription() {
        return "You can see a dashboard with buttons and a screen, but in the background you see a staircase that gives access up and down.";
    }

    @Override
    public String interact(Player player) {
        player.addToScore(-25);
        return "You have pressed one of the buttons that said not to press\nand an arrow has stuck in your arm.\n-25 POINTS";
    }

}
