
package FactoryMethod;

public interface CreditCard {
    
    public boolean makePayment(double amount);
    public void credit(double amount);
    public void debit(double amount);
}
