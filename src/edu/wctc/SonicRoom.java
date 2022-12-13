package edu.wctc;

public class SonicRoom extends room implements Lootable, Interactable, Exitable{

    public SonicRoom(String name) {super(name);}

    @Override
    public String exit(player player) {return "You have decided to take a break and watch the sunset on the X tornado" ;}



    @Override
    public String interact(player player) {
        player.addToScore(30);
        player.AddToInventory("A golden ring");
        return "You see a little chao that wants you to give him a pat on the head";
    }

    @Override
    public String Loot(player player) {
        player.addToScore(80);
        player.AddToInventory("A Chaos Emerald");
        return "You see a man but also looks like a doctor in a red suit get upset";
    }

    @Override
    public String GetDescription() {
        return "You have entered a bigger room that has loops and waterfalls. You see a blue hedgehog that runs super fast aside you and gives a thumbs up";
    }
}
