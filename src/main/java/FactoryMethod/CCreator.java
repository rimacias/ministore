package FactoryMethod;

public abstract class CCreator {

    public abstract CreditCard buildCard(Cliente c);
    public String genCardNumber(){
        // Generates a proper CardNumber
        return "";
    };
    public String genCVV(){
        // Generates a proper CVV
        return "";
    }
}
