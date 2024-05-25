import java.util.ArrayList;
import java.util.List;
interface Product {
    String getName();
    double getPrice();
    String getDescription();
}

abstract class PhysicalProduct implements Product {
    private double weight;

    public PhysicalProduct(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

abstract class DigitalProduct implements Product {
    // No additional properties needed for DigitalProduct
}

class Book extends PhysicalProduct {
    private String ISBN;

    public Book(String name, double price, String ISBN, double weight) {
        super(weight);
        this.ISBN = ISBN;
    }

    @Override
    public String getName() {
        return "Book";
    }

    @Override
    public double getPrice() {
        return 0; // Implement accordingly
    }

    @Override
    public String getDescription() {
        return "Book Description"; // Implement accordingly
    }
}

class Movie extends DigitalProduct {
    private String format;

    public Movie(String name, double price, String format) {
        this.format = format;
    }

    @Override
    public String getName() {
        return "HARRY POTTER";
    }

    @Override
    public double getPrice() {
        return 34.23; // Implement accordingly
    }

    @Override
    public String getDescription() {
        return "A magician who fought against the evil dude voldemort"; // Implement accordingly
    }
}

abstract class ProductFactory {
    public abstract Product createProduct(String type);
}

class PhysicalProductFactory extends ProductFactory {
    @Override
    public Product createProduct(String type) {
        if (type.equalsIgnoreCase("Book")) {
            return new Book("peeray qamil", 10.0, "112653", 2.52);
        }
        return null;
    }
}

class DigitalProductFactory extends ProductFactory {
    @Override
    public Product createProduct(String type) {
        if (type.equalsIgnoreCase("Movie")) {
            return new Movie("house of wax", 34.53, "DVD");
        }
        return null;
    }
}

class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        ProductFactory physicalFactory = new PhysicalProductFactory();
        ProductFactory digitalFactory = new DigitalProductFactory();

        Product book = physicalFactory.createProduct("Book");
        Product movie = digitalFactory.createProduct("Movie");

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(book);
        cart.addProduct(movie);

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: " + totalPrice);
    }
}