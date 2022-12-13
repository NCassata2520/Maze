package edu.wctc;

public abstract class room {
    String name;
    room north;
    room south;
    room east;
    room west;
    room up;
    room down;
    public room(String name) {this.name = name;}
    public void setEast(room east) {this.east= east;}
    public void setSouth(room south) {this.south = south;}
    public void setWest(room west) {this.west = west;}
    public void setNorth(room north) {this.north = north;}
    public void setUp(room up) {this.up = up;}
    public void setDown(room down) {this.down = down;}

    public room GetAdjoiningRoom(char roomCode){

        switch (roomCode){
            case 'n': return north;
            case 'e': return east;
            case 's': return south;
            case 'w': return west;
            case 'u': return up;
            case 'd': return down;
            default: return null;
        }

    }

    public abstract String GetDescription();

    public String GetExits(){
        String OpenDirection = "";
        if (north != null)
            OpenDirection += "North ";
        if (east != null)
            OpenDirection += "East ";
        if (south != null)
            OpenDirection += "South ";
        if (west != null)
            OpenDirection += "West ";
        if (up != null)
            OpenDirection += "Up ";
        if (down != null)
            OpenDirection += "Down ";
        return OpenDirection;
    }

    public String GetName() {
        return name;
    }

    public boolean IsValidDirection(char c) {
        if (GetAdjoiningRoom(c) != null)
            return true;
        else return false;
    }
}
