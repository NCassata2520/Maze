package edu.wctc;

import java.util.ArrayList;

public class player {

    int score;

    ArrayList<String> Inventory = new ArrayList<>();

    public void AddToInventory(String invenor){
        Inventory.add(invenor);
    }

    public void addToScore(int newscore) {
        score += newscore;
    }

    public String GetInventory() {
        String inventor = "";
        if (Inventory.size() == 0)
            return "Your inventory is currently empty ";
        else
            for (int i = 0; i < Inventory.size(); i++){
                inventor += Inventory.get(i);
            }
            return inventor;
    }

    public int GetScore() {return score;}
}
