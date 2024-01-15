package database_dev;

import Models.Room;

import java.util.HashMap;

public class RoomDatabase {
    HashMap<String , Room> roomDB;
   public RoomDatabase(){
        this.roomDB = new HashMap<>();
   }
    public Room getUnoccupiedRoom(){
        for(String key : roomDB.keySet()){
            Room room = roomDB.get(key);
            if(!room.isOccupied()){
                return room;
            }
        }
        return null;
    }

    public int getTotalRoom(){
       return roomDB.size();
    }

    public void addRoomToDB(Room room){
       String roomID = room.getRoomId();
       roomDB.put(roomID , room);
    }



}
