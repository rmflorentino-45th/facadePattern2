package facadePattern2;

public class Housekeeping implements HotelService {

    private String roomNumber;

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override 
    public void cleanRoom(String roomNumber) {
        setRoomNumber(roomNumber);
        System.out.println("A maid is sent to clean room " + getRoomNumber() + "!\n");
    }

    @Override
    public void pickUpVehicle(String plateNumber) {
        throw new UnsupportedOperationException("Unimplemented method 'pickUpVehicle'");
    }

}