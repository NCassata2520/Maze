package edu.wctc;

public class MarioRoom extends room{

    public MarioRoom(String name) {super(name);}

    @Override
    public String GetDescription() {
        return "You enter a room that has Mario collecting golden coins and Bowser taking the princess again";
    }
}
