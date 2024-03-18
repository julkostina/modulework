class Kitchen {
    public void prepareOrder(Order order) {
        System.out.println("Preparing order");
        order.setState(new Delivered());
    }
}