public class Client implements OrderObserver {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Order status updated for client " + name + ": " + order.getState());
    }
}
