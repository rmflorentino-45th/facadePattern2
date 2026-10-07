package facadePattern2;

public class HotelApp {

    public static void main(String[] args) {

        Valet helper = new Valet();
        Housekeeping maid = new Housekeeping();

        FrontDesk facade1 = new FrontDesk(helper);
        FrontDesk facade2 = new FrontDesk(maid);

        facade1.pickUpVehicle("NBC 1234");
        facade2.cleanRoom("M145");

    }
    
}