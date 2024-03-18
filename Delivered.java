public class Delivered  implements OrderState{
    @Override
    public void handle(Order order) {
        System.out.println("Order  is ready for delivery");
    }
}
