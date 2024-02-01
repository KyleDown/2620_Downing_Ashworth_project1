package paymentMethods;

public class GiftCard implements Card{

    double balance;

    public GiftCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return 0;
    }

    public void setBalance(double balance) {
    }
    
    public double adjustBalance() {
        return 0;
    }
    
}
