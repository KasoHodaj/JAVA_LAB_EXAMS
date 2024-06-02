package Exams_one;

public abstract class InventoryItem {
    protected int id;
    protected int stockQuantity;

    public InventoryItem(int id, int stockQuantity) {
        this.id = id;
        this.stockQuantity = stockQuantity;
    }

    public abstract double getInventoryValue();
}

