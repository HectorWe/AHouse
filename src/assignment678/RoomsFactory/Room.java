package assignment678.RoomsFactory;

import assignment678.LootsStrategy.Lootable;
import assignment678.Player;

public abstract class Room {

    private String name;
    private Room north, south, east, west, up, down;
    Lootable lootable;

    public Room(String name, Lootable lootable) {
        this.name = name;
        this.lootable = lootable;
    }

    public String performAction(Player player, char input){
        return lootable.action(player,input);
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction){
         switch(direction) {
             case 'n':
                if (north != null)
                    return north;
                    break;
             case 's':
                 if (south != null)
                 return south;
                 break;
             case 'e':
                 if (east != null)
                     return east;
                 break;
             case 'w':
                 if (west != null)
                     return west;
                 break;
             case 'u':
                 if (up != null)
                     return up;
                 break;
             case 'd':
                 if (down != null)
                     return down;
                 break;
        }
        return null;
    }

    public String getExits(){
        return null;
    }

    public String getName() {
        return name;
    }

    public boolean isValidDirection(char direction) {
        switch(direction) {
            case 'n':
                if (north != null)
                    return true;
                break;
            case 's':
                if (south != null)
                    return true;
                break;
            case 'e':
                if (east != null)
                    return true;
                break;
            case 'w':
                if (west != null)
                    return true;
                break;
            case 'u':
                if (up != null)
                    return true;
                break;
            case 'd':
                if (down != null)
                    return true;
                break;
        }
        return false;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    @Override
    public String toString() {
        return name;
    }
}
