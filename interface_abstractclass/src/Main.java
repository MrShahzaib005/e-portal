interface Product{
    String getname();
    double getPrice();
    String getDescription();
}
abstract class PhyiscalProduct implements Product {
    private double weight;
    public void PhysicalProduct(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
}
abstract class DigitalProduct implements Product{

}
public class Book extends PhyiscalProduct{
    private String ISBN;
    public Book(String name,double price,String ISBN,double weight)
    {
        super(weight);
        this.ISBN=ISBN;
    }
    public String getISBN(){
        return ISBN;
    }
    public String getname()
    {
        return "book";
    }
    public double getPrice()
    {
        return 0;
    }
    public String getDescription()
    {
        return "book descritption";
    }
}
public class Movie extends DigitalProduct{
    private String format;
    public Movie(String name,double price,String format)
    {
        this.format=format;
    }
    public String getname()
    {
        return "movie";
    }
    public double getPrice()
    {
        return 0;
    }
    public String getDescription(){
        return "movie description";
    }
    public String getFormat(){
        return format;
    }
}
abstract class ProductFactory{
    public abstract Product createProduct(String type);
}
public class PhysicalProductFactory extends ProductFactory{
    public Product createProduct(String type){
        if (type.equalsIgnoreCase(String type)){
            return new Book("harrypotter",24.67,1122331,1.43);
        }
        return null;
    }}
public class DigitalProductFactory extends ProductFactory{
    public Product createProduct(String type)
    {
        if(type.equalsIgnoreCase("cars 2")){
            return new Movie("anaconda",12.657,"cd");
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}