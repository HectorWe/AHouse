package assignment678.RoomsFactory;

import assignment678.LootsStrategy.Key;

public class RoomUp extends Room {


    public RoomUp() {
        super("Destroyed Attic.", new Key());
    }

    public String getExits(){
        return "Down, West";
    }

    @Override
    public String getDescription() {
        return "This room is infested with spider webs, the windows are boarded up,\nthere is only a closet and an old desk.";
    }

//    @Override
//    public String loot(Player player) {
//        player.addToInventory("LLAVE ");
//        player.addToScore(5);
//        return "\n" +
//                "You look like crazy for any clue on the desktop to get out,\nand you only find a key that says \" EXIT\".\n 5 POINTS";
//    }
}
