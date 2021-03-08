package uaslp.enginering.exam.model;

public class Reservation {
    String name;
    int RoomNumber;
    String ArrivalDate;
    int Nights;
    Guest guest = new Guest();




    public Guest getGuest(){
        return guest;
    }


    public void setGuest(Guest guest){
        this.guest = guest;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(String setArrivalDate) {
        ArrivalDate = setArrivalDate;
    }

    public int getNights() {
        return Nights;
    }

    public void setNights(int  nights) {
        Nights = nights;
    }




}
