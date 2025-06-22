package Module2;

import java.util.Arrays;

class ProductSearchItem {
    int productId;
    String productName;
    String category;

    public ProductSearchItem(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class ProductSearch {

    public static ProductSearchItem linearSearch(ProductSearchItem[] products, String name) {
        for (ProductSearchItem p : products) {
            if (p.productName.equals(name)) return p;
        }
        return null;
    }

    public static ProductSearchItem binarySearch(ProductSearchItem[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareTo(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        ProductSearchItem[] products = {
            new ProductSearchItem(1, "Laptop", "Electronics"),
            new ProductSearchItem(2, "Mouse", "Electronics"),
            new ProductSearchItem(3, "Keyboard", "Electronics")
        };

        Arrays.sort(products, (a, b) -> a.productName.compareTo(b.productName)); // for binary search

        ProductSearchItem result = linearSearch(products, "Mouse");
        System.out.println("Linear Search: " + (result != null ? result.productName : "Not Found"));

        result = binarySearch(products, "Keyboard");
        System.out.println("Binary Search: " + (result != null ? result.productName : "Not Found"));
    }
}

