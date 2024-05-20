package assignment678.LootsStrategy;

import assignment678.Player;

public class NoLoot implements Lootable {
    @Override
    public String action(Player player, char input) {
        return "Sorry!\nThis room is empty";
    }
}
