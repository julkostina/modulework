
public class WholeSystem {
    public static void main(String[] args) {
        Client client1 = new Client("Ann");

        Order order = new Order();
        order.attachObserver(client1);

        Products dish1 = new Products("Salad", 100.0);
        Products drink1 = new Products("Pizza", 135);

        Cart cart = new Cart();
        cart.addItem(dish1);
        cart.addItem(drink1);

        for (Products item : cart.getItems()) {
            order.addProduct(item);
        }

        Waiter waiter = new Waiter();
        Kitchen kitchen = new Kitchen();

        waiter.setDeliveryStrategy(new Courier());

        waiter.takeOrder(order);
        kitchen.prepareOrder(order);
    }
}