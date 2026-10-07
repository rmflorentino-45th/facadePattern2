package facadePattern2;

public class Cart implements HotelService {

    private int numberOfCarts;

    public int getNumberOfCarts() {
        return this.numberOfCarts;
    }

    public void setNumberOfCarts(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void requestCart(int numberOfCarts) {
        setNumberOfCarts(numberOfCarts);
        System.out.println("Cart no. " + numberOfCarts + " is sent to the room!\n");
    }

    @Override
    public void pickUpVehicle(String plateNumber) {
        throw new UnsupportedOperationException("Invalid hotel service 'pickUpVehicle'.");
    }

    @Override
    public void cleanRoom(String roomNumber) {
        throw new UnsupportedOperationException("Invalid hotel service 'cleanRoom'.");
    }

}

