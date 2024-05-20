package assignment678;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboar = new Scanner(System.in);
        char playerInterction = ' ';
        HouseSingleton houseSingleton = HouseSingleton.getInstance();

        System.out.println("Wellcome!!\n This game is called A HOUSE and it controls are to easy.\n You can move when you type this keys:");
        System.out.println(" - 'n' to move for the North.\n - 's' to move for the South.\n - 'e' to move for the east.\n - 'w' to move for the West.\n - 'u' to go up.\n - 'd' to go down.");
        System.out.println("Also you can interact with the rooms if type:");
        System.out.println(" - 'i' if you want to investigate.\n - 'l' if you want to loot.\n - 'x' if you think that is the exit.\n - 'v' if you want to see your inventory.");
        System.out.println("GOOD LUCK!!");
        System.out.println("\n-----------\n  A HOUSE \n-----------");
        System.out.println("A normal day you are walking home, someone calls your name, \nthen you turn to see who it was, and you lose consciousness...");

        while (!houseSingleton.isFinished){

            switch (playerInterction){
                case ('i'):
                    System.out.println(houseSingleton.interactWithCurrentRoom());
                break;
                case ('l'):
                    System.out.println(houseSingleton.lootCurrentRoom('l'));
                break;
                case ('x'):
                    System.out.println(houseSingleton.exitCurrentRoom());
                break;
                case ('v'):
                    System.out.println(houseSingleton.getPlayerInventory());
                break;
            }

            if (!houseSingleton.isFinished){
                System.out.printf("You are in the %s\n", houseSingleton.getCurrentRoomName());
                System.out.printf("Description: %s\n", houseSingleton.getCurrentRoomDescription());
                System.out.printf("The exits are %s\n", houseSingleton.getCurrentRoomExits());

                houseSingleton.move(playerInterction = keyboar.next().charAt(0));
            }else {
                houseSingleton.isFinished = true;
            }
        }

        System.out.println("Everything went well, you got out of the MAZE HOUSE alive!");
        System.out.println("GAME OVER");
        System.out.printf("Your Score is: %s POINTS.", houseSingleton.getPlayerScore());

    }

}
