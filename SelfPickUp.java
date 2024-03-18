public class SelfPickUp implements  DeliveryStrategy{
    @Override
    public void deliver(Order order) {
        System.out.println("Deliver order to home");
    }
}
