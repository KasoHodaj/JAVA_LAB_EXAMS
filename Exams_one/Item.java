package Exams_one;

public class Item extends InventoryItem {
    private double lotPrice;

    public Item(int id, int stockQuantity, double lotPrice) {
        super(id, stockQuantity);
        this.lotPrice = lotPrice;
    }

    @Override
    public double getInventoryValue() {
        return stockQuantity * lotPrice;
    }

    public double getLotPrice() {
        return lotPrice;
    }
}
