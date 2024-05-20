package assignment678.LootsStrategy;

import assignment678.Player;

public class Key implements Lootable {
    @Override
    public String action(Player player, char input) {
        if(Character.toLowerCase(input) == 'l') {
            player.addToScore(5);
            player.addToInventory("KEY ");
            return "\nYou look like crazy for any clue on the desktop to get out,\nand you only find a key that says \" EXIT\".\n 5 POINTS";
        }else
            return "Invalid input" ;
    }
}
