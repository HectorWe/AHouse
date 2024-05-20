package assignment678.LootsStrategy;

import assignment678.Player;

public class APenny implements Lootable {
    @Override
    public String action(Player player, char input) {
        if(Character.toLowerCase(input) == 'l') {
            player.addToScore(1);
            player.addToInventory("PENNY ");
            return "You only found a penny among the boxes\\n1 POINT";
        }else
            return "Invalid input" ;
    }
}
