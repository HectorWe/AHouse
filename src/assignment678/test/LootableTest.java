package assignment678.test;

import assignment678.LootsStrategy.*;
import assignment678.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LootableTest {

    Lootable aPenny;
    FlashLight flashLight;
    Key key;
    Player player;

    @BeforeEach
    void setUp() {
        aPenny = new APenny();
        flashLight = new FlashLight();
        key = new Key();
        player = new Player();
    }

    @Test
    void aPennyPositiveTest() {
        Assertions.assertEquals("You only found a penny among the boxes\\n1 POINT",aPenny.action(player,'l'));
    }

    @Test
    void aPennyNegativeTest() {
        Assertions.assertEquals("Invalid input",aPenny.action(player,'r'));
    }

    @Test
    void flashPositiveTest() {
        Assertions.assertEquals("Opening one of the drawers you found a flashlight.\n25 POINTS",flashLight.action(player,'l'));
    }

    @Test
    void flashNegativeTest() {
        Assertions.assertEquals("Invalid input",flashLight.action(player,'r'));
    }

    @Test
    void keyPositiveTest() {
        Assertions.assertEquals("\nYou look like crazy for any clue on the desktop to get out,\nand you only find a key that says \" EXIT\".\n 5 POINTS",key.action(player,'l'));
    }

    @Test
    void keyNegativeTest() {
        Assertions.assertEquals("Invalid input",key.action(player,'r'));
    }

}