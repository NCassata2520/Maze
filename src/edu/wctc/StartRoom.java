package edu.wctc;

public class StartRoom extends room{
    public StartRoom(String name){ super(name);}

    @Override
    public String GetDescription() {
        return "You find yourself in a room that has a tv with a strange console connected to it";
    }
}
