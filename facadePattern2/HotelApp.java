package facadePattern2;

public class HotelApp {

    public static void main(String[] args) {

        Valet helper = new Valet();
        Housekeeping maid = new Housekeeping();
        Cart carts = new Cart();

        FrontDesk facade1 = new FrontDesk(helper);
        FrontDesk facade2 = new FrontDesk(maid);
        FrontDesk facade3 = new FrontDesk(carts);

        facade1.pickUpVehicle("NBC 1234");
        facade2.cleanRoom("M145");
        facade3.requestCart(12);       

    }
    
}