package uaslp.enginering.exam.model;

import java.util.ArrayList;


public class Hotel {
    String name;
    int Poolsize;
    int GymSize;
    private final ArrayList<Reservation> reservations;
    private final ArrayList<Room> rooms;

    public Hotel(String comfort_poo_inn) {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        this.name = comfort_poo_inn;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);
        reservations.add(reservation);
    }


    public void addRoom(Room room){
        rooms.add(room);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Room> getRooms(){
        return(rooms);
    }

    public void setPoolsize(int poolsize) {
        Poolsize = poolsize;
    }

    public int getPoolsize() {
        return Poolsize;
    }

    public void setGymSize(int gymSize) {
        GymSize = gymSize;
    }

    public int getGymSize() {
        return GymSize;
    }


    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
