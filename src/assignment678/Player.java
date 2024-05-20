package assignment678;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private int score;
    private List<String> inventory = new ArrayList<String>();

    public void addToInventory(String addInventory) {
        this.inventory.add(addInventory);
    }

    public String getInventory() {

        if ((inventory.get(inventory.size()-1)) == "Exit"){
            return "Exit";
        } else if(inventory != null){
        //return String.format("%s", inventory.get(inventory.size()-1));

            String invetoryList= "";
            for (String a : inventory ){
                invetoryList += "\n- " + a ;
            }
            return invetoryList;
        }
        return "Your backpack is empty!";
    }

    public void addToScore(int addScore) {
        score += addScore;
    }

    public int getScore() {
        return score;
    }
}
