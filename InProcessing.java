public class InProcessing  implements OrderState{

    @Override
    public void handle(Order order) {
        System.out.println("Order  is processing");
    }
}
