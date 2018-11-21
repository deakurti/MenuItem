public class Sandwich implements MenuItem{
    private String name;
    private double price;

    public Sandwich (String name, double price) {
        this.price = price;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

}
