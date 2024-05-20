package assignment678;

import assignment678.RoomsFactory.*;

public class HouseSingleton {

    private Room currentRoom;
    private Player player;
    protected boolean isFinished;
    private static HouseSingleton housesingle_instance = null;

    private HouseSingleton() {
        this.player = new Player();

        Room north = new RoomNorth();
        Room south = new RoomSouth();
        Room east = new RoomEast();
        Room west = new RoomWest();
        Room up = new RoomUp();
        Room down = new RoomDown();

        south.setNorth(north);
        north.setSouth(south);
        north.setEast(east);
        east.setWest(north);
        east.setUp(up);
        east.setDown(down);
        down.setUp(east);
        up.setDown(east);
        up.setWest(west);
        west.setEast(up);

        currentRoom = south;

    }

    public String exitCurrentRoom(){
        if(currentRoom instanceof Exitable exitable){
            isFinished();
            return exitable.exit(player);
        }
        return "The room is not exitable";
    }

    public String interactWithCurrentRoom(){
        if(currentRoom instanceof Interactable interactable){
            return interactable.interact(player);
        }
        return "Interactions are not possible";
    }

    public String lootCurrentRoom(char input) {
    return currentRoom.performAction(player, input);
}

    public boolean move(char move){

        if (currentRoom.isValidDirection(move) == true ) {
            currentRoom = currentRoom.getAdjoiningRoom(move);
            return true;
        }
        return false;

    }

    public int getPlayerScore(){
        return player.getScore();
    }

    public String getPlayerInventory(){
        return player.getInventory();
    }

    public String getCurrentRoomExits(){
        return currentRoom.getExits();
    }

    public String getCurrentRoomName() {
        return currentRoom.getName();
    }

    public String getCurrentRoomDescription(){
        return currentRoom.getDescription();
    }

    public boolean isFinished(){
        return isFinished = true;
    }

    public static HouseSingleton getInstance() {
        if (housesingle_instance == null)
            housesingle_instance = new HouseSingleton();
        return housesingle_instance;
    }
}
