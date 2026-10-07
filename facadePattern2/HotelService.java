package facadePattern2;

public interface HotelService {
    void pickUpVehicle(String plateNumber);
    void cleanRoom(String roomNumber);
    void requestCart(int numberOfCarts);
}