package assignment678.RoomsFactory;

import assignment678.LootsStrategy.NoLoot;

public class RoomSouth extends Room {

    public RoomSouth() {
        super("Old Cell.", new NoLoot());
    }

    public String getExits() {
        return "North";
    }

    @Override
    public String getDescription() {
        return "You open your eyes, the first thing you see is a skeleton pointing to a door to the north.";
    }

}
