import java.util.*;

//product in the ecommerece platform 
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

    // Method to display product details 
    void displayDetails() {
        System.out.println("Product ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Category   : " + category);
        System.out.println("Price      : Rs" + price);
        System.out.println("----------");
    }
}

// Basic e-commerce platform with product search functionality.
public class ECommerceSearchFunction {
        public static void main(String[] args) {
        // Creating a list to store products
        List<Product> products = new ArrayList<>();
        // Adding sample products to the platform like 5 or 6 products
        products.add(new Product(101, "iPhone 16", "Electronics", 79999));
        products.add(new Product(102, "Nike jordans", "Footwear", 14599));
        products.add(new Product(103, "Lenovo Flipbook", "Electronics", 84999));
        products.add(new Product(104, "Wildcraft Backpack", "Accessories", 1599));
        products.add(new Product(105, "Titan Raga", "Accessories", 8999));

        /*  
        *Accept search function and take inputs from the user 
        *here the search is taking place using the attributes product name or category
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name or category to search: ");
        String searchQuery = sc.nextLine().toLowerCase();

        boolean matchFound = false;

        // Searching
        for (Product product : products) {
            if (product.name.toLowerCase().contains(searchQuery) ||
                product.category.toLowerCase().contains(searchQuery)) {
                product.displayDetails();
                matchFound = true;
            }
        }

        // Show this message if no match is found
        if (!matchFound) {
            System.out.println(" No products matched search. Please try again.");
        }
    }
}
