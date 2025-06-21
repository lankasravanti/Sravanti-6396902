import java.util.*;

//product in the Ecommerce platform

class Product {
    int id;
    String name;
    String category;
    double price;

    // Constructor to initialize the product attributes
    Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Method to display product details in a readable format
    void displayDetails() {
        System.out.println("Product ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Category   : " + category);
        System.out.println("Price      : Rs" + price);
        System.out.println("------");
    }
}

//class to simulate basic search function in Ecommrece platform
public class ECommerceSearchFunction {

    public static void main(String[] args) {
        // Create a list to store products
        List<Product> products = new ArrayList<>();

        // Adding sample products to the platform
        products.add(new Product(1001, "iPhone 14", "Electronics", 79999));
        products.add(new Product(1002, "Nike Jordans", "Footwear", 14599));
        products.add(new Product(1003, "Lenovo Flipbook", "Electronics", 94999));
        products.add(new Product(1004, "Wildcraft Backpack", "Accessories", 1599));
        products.add(new Product(1005, "Titan Raga", "Accessories", 12999));

        // User input to search the product
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name or category to search: ");
        String searchQuery = sc.nextLine().toLowerCase();

        boolean matchFound = false;

        // Search logic: look for matching name or category
        for (Product product : products) {
            if (product.name.toLowerCase().contains(searchQuery) ||
                product.category.toLowerCase().contains(searchQuery)) {
                product.displayDetails();
                matchFound = true;
            }
        }

        // Show message if no match found
        if (!matchFound) {
            System.out.println("No products matched your search. Please try again.");
        }
    }
}
