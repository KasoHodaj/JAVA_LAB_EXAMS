package Exams_one;

public class Supplier {
    String name;
    Product product;

    public Supplier(String name) {
        this.name = name;
    }

    public void addPurchase(int id, String productName, double price, int quantity) {
        if (product == null || product.id != id) {
            Item newItem = new Item(id, quantity, price);
            product = new Product(id, productName, newItem);
        } else {
            product.item.stockQuantity += quantity;
        }
    }

    public void displayInventory() {
        if (product != null) {
            System.out.println("Product ID: " + product.id);
            System.out.println("Product Name: " + product.productName);
            System.out.println("Total Quantity: " + product.item.stockQuantity);
            System.out.println("Total Value: " + product.getInventoryValue());
        } else {
            System.out.println("No products available.");
        }
    }
}

