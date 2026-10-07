package facadePattern2;

public class Valet implements HotelService {

    private String plateNumber;

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override 
    public void pickUpVehicle(String plateNumber) {
        setPlateNumber(plateNumber);
        System.out.println
        ("A valet is sent to receive the car with the plate number of " + getPlateNumber() + "!\n");
    }

    @Override
    public void cleanRoom(String roomNumber) {
        throw new UnsupportedOperationException("Invalid hotel service 'cleanRoom'.");
    }

    @Override
    public void requestCart(int numberOfCarts) {
        throw new UnsupportedOperationException("Invalid hotel service 'requestCart'.");
    }
    
}