package Exams_one;

public class Product implements iProductInventory {
    int id;
    String productName;
    Item item;

    public Product(int id, String productName, Item item) {
        this.id = id;
        this.productName = productName;
        this.item = item;
    }

    @Override
    public double getInventoryValue() {
        return item.getInventoryValue();
    }
}


