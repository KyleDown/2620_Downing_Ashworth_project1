package menuItems;

public class Sundae extends IceCream {

    private int toppings;

    public Sundae(String name, double cost, int scoops, int toppings) {
        super(name, cost, scoops);
        this.toppings = toppings;
    }

    public int getToppings() {
        return toppings;
    }
    
}
