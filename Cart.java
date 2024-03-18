import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<Products> items;
    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Products product) {
        items.add(product);
    }
    public void removeItem(Products product) {
        items.remove(product);
    }

    public List<Products> getItems() {
        return items;
    }
}