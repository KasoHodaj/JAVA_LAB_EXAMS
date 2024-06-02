package Exams_one;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supplier supplier = new Supplier("Supplier X");

        while (true) {
            System.out.print("Enter product ID (0 to stop): ");
            int id = scanner.nextInt();
            if (id == 0) {
                break;
            }

            System.out.print("Enter product name: ");
            String productName = scanner.next();

            System.out.print("Enter purchase price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            supplier.addPurchase(id, productName, price, quantity);
        }

        supplier.displayInventory();

    }
}
