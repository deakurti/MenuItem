public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName(){
        return (this.sandwich.getName()+ this.salad.getName()+ this.drink.getName()+" Trio");
    }

    public double getPrice(){
        if (sandwich.getPrice() > drink.getPrice() && drink.getPrice()>salad.getPrice())
            return sandwich.getPrice()+ drink.getPrice();
        else if (sandwich.getPrice() > salad.getPrice() && salad.getPrice()>drink.getPrice())
            return sandwich.getPrice()+ drink.getPrice();
        else {
            return drink.getPrice() + salad.getPrice();
        }
    }


}

