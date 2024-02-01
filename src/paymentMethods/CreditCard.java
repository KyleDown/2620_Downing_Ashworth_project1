package paymentMethods;

public class CreditCard implements Card {

   double maxBalance;
   double currBalance;

    public CreditCard(double maxBalance) {
        this.maxBalance = maxBalance;
        this.currBalance = 0;
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
