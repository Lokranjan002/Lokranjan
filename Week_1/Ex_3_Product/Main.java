package Week_1.Ex_3_Product;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Mobile", "Electronics"),
                new Product(104, "Book", "Education"),
                new Product(105, "Headphones", "Electronics")
        };

        System.out.println("Linear Search for 'Book':");
        Product result1 = SearchService.linearSearch(products, "Book");
        System.out.println(result1 != null ? result1 : "Not Found");

        SearchService.sortByName(products);
        System.out.println("\nBinary Search for 'Mobile':");
        Product result2 = SearchService.binarySearch(products, "Mobile");
        System.out.println(result2 != null ? result2 : "Not Found");
    }
}
