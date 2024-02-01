package paymentMethods;

public interface Card {

    public double getBalance();

    public void setBalance(double balance);

    public double adjustBalance();
}
