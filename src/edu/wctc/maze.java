package edu.wctc;

public class maze {

    private player Player;

    private room currentRoom;

    boolean isFinished = false;


    public maze() {
        Player = new player();
        currentRoom = new StartRoom("Game room");
        SonicRoom sonicRoom =  new SonicRoom("Sonic room");
        HaloRoom haloRoom =  new HaloRoom("Halo room");
        MarioRoom marioRoom = new MarioRoom("Mario room");
        currentRoom.setUp(marioRoom);
        marioRoom.setEast(haloRoom);
        marioRoom.setDown(currentRoom);
        haloRoom.setWest(marioRoom);
        haloRoom.setNorth(sonicRoom);
        sonicRoom.setSouth(haloRoom);

    }

    public void finish(){
        this.isFinished=true;
    }

    public String ExitCurrentRoom(){
        if(currentRoom instanceof Exitable){
            ((Exitable) currentRoom).exit(Player);
            return((Exitable) currentRoom).exit(Player);
        }else
            return"Sorry this room is not exitable";
    }
    public String GetCurrentRoomDescription(){
        return currentRoom.GetDescription();
    }
    public String GetCurrentRoomExits(){
        return currentRoom.GetExits();
    }
    public String GetPlayerInventory(){
        return Player.GetInventory();
    }
    public int GetPlayerScore() {
        return Player.GetScore();
    }
    public String InteractWithCurrentRoom(){
        if (currentRoom instanceof Interactable){
            return ((Interactable) currentRoom).interact(Player);
        }
        else return "Nothing to interact here";
    }
    public boolean isFinished(){
        return isFinished;
    }

    public String LootCurrentRoom(){
        if(currentRoom instanceof Lootable){
            return ((Lootable) currentRoom).Loot(Player);
        }
        else return "Nothing to loot here";
    }

    public boolean move(char c){
        if(currentRoom.IsValidDirection(c)){
            switch (c){
                case 'n':
                    currentRoom = currentRoom.north;
                    break;
                case 'e':
                    currentRoom = currentRoom.east;
                    break;
                case 's':
                    currentRoom = currentRoom.south;
                    break;
                case 'w':
                    currentRoom = currentRoom.west;
                    break;
                case 'u':
                    currentRoom = currentRoom.up;
                    break;
                case 'd':
                    currentRoom = currentRoom.down;
                    break;
            }
            return true;
        }else return false;
    }
}
