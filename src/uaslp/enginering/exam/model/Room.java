package uaslp.enginering.exam.model;

public class Room {
    int Number;
    String RoomDescription;
    Object status;
    int size;

    public Room(int roomNumber) {
        Number = roomNumber;
    }

    public Room(int number, String roomDescription, Object estatus) {
        Number = number;
        RoomDescription = roomDescription;
        status = estatus;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public void setRoomNumber(int roomNumber) {
        Number = roomNumber;
    }

    public int getNumber() {
        return Number;
    }

    public void setRoomDescription(String roomDescription) {
        RoomDescription = roomDescription;
    }

    public String getRoomDescription() {
        return RoomDescription;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}


