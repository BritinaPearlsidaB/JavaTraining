class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters for name and price (omitted for brevity)

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

// Subclass: ElectronicProduct
class ElectronicProduct extends Product {
    String brand;

    public ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    // Additional methods specific to electronic products (omitted for brevity)
}

// Subclass: KitchenProduct
class KitchenProduct extends Product {
    String material;

    public KitchenProduct(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    // Additional methods specific to kitchen products (omitted for brevity)
}

// Subclass: FoodProduct
class FoodProduct extends Product {
    String expiryDate;

    public FoodProduct(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    // Additional methods specific to food products (omitted for brevity)
}

// Subclass: BookProduct
class BookProduct extends Product {
    String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    // Additional methods specific to book products (omitted for brevity)
}

class Main {
    public static void main(String[] args) {
        // Create instances of different product types
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 800.0, "Dell");
        KitchenProduct blender = new KitchenProduct("Blender", 50.0, "Stainless Steel");
        FoodProduct chocolate = new FoodProduct("Chocolate", 2.5, "2023-12-31");
        BookProduct novel = new BookProduct("The Great Gatsby", 12.0, "F. Scott Fitzgerald");

        // Create a polymorphic collection to store products
        Product[] products = {laptop, blender, chocolate, novel};

        // Display information for each product
        for (Product product : products) {
            product.displayInfo();
            System.out.println(); // Add a newline for readability
        }
    }
}
