public class Courier implements  DeliveryStrategy{
    @Override
    public void deliver(Order order) {
        System.out.println("Courier  delivers order to home");
    }
}