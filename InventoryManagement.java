package Module2;
import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagement {
    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    public void updateProduct(Product p) {
        inventory.put(p.productId, p);
    }

    public void deleteProduct(int id) {
        inventory.remove(id);
    }

    public void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p.productId + " | " + p.productName + " | " + p.quantity + " | " + p.price);
        }
    }

    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();
        im.addProduct(new Product(1, "Laptop", 10, 45000.0));
        im.addProduct(new Product(2, "Monitor", 5, 12000.0));

        System.out.println("Initial Inventory:");
        im.displayInventory();

        im.updateProduct(new Product(2, "Monitor", 8, 12000.0));
        im.deleteProduct(1);

        System.out.println("Updated Inventory:");
        im.displayInventory();
    }
}
