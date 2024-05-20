package assignment678.RoomsFactory;

import assignment678.LootsStrategy.FlashLight;

public class RoomNorth extends Room {

    public RoomNorth() {
        super("Weapons Room." , new FlashLight());
    }

    public String getExits(){
        return "South, East";
    }

    @Override
    public String getDescription() {
        return "In the room, a huge lamp illuminates a gunsmith with old weapons that do not work.";
    }

//    @Override
//    public String loot(Player player) {
//        player.addToInventory("FlASH-LIGHT ");
//        player.addToScore(25);
//        return "Opening one of the drawers you found a flashlight.\n25 POINTS";
//    }
}
