class Waiter {
    private DeliveryStrategy deliveryStrategy;

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void takeOrder(Order order) {
        order.processOrder();
        deliveryStrategy.deliver(order);
    }
}