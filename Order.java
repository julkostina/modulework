import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Products> products;
    private OrderState state;
    private List<OrderObserver> observers;

    public Order() {
        products = new ArrayList<Products>();
        state = new Prepearing();
        observers = new ArrayList<>();
    }

    public void addProduct(Products product) {
        products.add(product);
    }

    public void setState(OrderState state) {
        this.state = state;
        notifyObservers();
    }

    public String getState() {
        return state.getClass().getSimpleName();
    }

    public void attachObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void processOrder() {
        state.handle(this);
    }
}
