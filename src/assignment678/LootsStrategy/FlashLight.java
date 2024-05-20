package assignment678.LootsStrategy;

import assignment678.Player;

public class FlashLight implements Lootable {
    @Override
    public String action(Player player, char input) {
        if(Character.toLowerCase(input) == 'l') {
            player.addToScore(25);
            player.addToInventory("FlASH-LIGHT ");
            return "Opening one of the drawers you found a flashlight.\n25 POINTS";
        }else
            return "Invalid input" ;
    }
}
