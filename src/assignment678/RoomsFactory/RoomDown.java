package assignment678.RoomsFactory;

import assignment678.Interactable;
import assignment678.LootsStrategy.APenny;
import assignment678.Player;

public class RoomDown extends Room implements Interactable {

    public RoomDown() {
        super("Pestilent Sewers", new APenny());
    }

    public String getExits(){
        return "Up";
    }

    @Override
    public String getDescription() {
        return ("The atmosphere is dense and you can barely breathe,\nbut there is a blocked door that leads outside and a stack of boxes.");
    }

    @Override
    public String interact(Player player) {
        player.addToScore(-15);
        return "\n" +
                "You took a long time trying to open the door,\nnow you're dizzy and it's hard for you to breathe \n-15 POINTS";
    }

//    @Override
//    public String loot(Player player) {
//        player.addToInventory("PENNY ");
//        player.addToScore(1);
//        return "You only found a penny among the boxes\n1 POINT";
//    }
}
