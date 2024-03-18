public class Prepearing  implements OrderState{
    @Override
    public void handle(Order order) {
        System.out.println("Order is preparing");
    }
}
