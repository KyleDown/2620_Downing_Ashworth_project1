package menuItems;

public class IceCream extends Item{

    private int scoops;

    public IceCream(String name, double cost, int scoops){
        super(name, cost);
        this.scoops = scoops;
    }

    public int getScoops() {
        return scoops;
    }
    
}
