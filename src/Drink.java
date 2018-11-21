public class Drink implements MenuItem{
    private String name;
    private double price;

    public Drink (String name, double price) {
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
