package FactoryMethod;

public class CCbuilder {

    public CreditCard genCardForClient(Cliente c) {
        CCreator ccCreator;
        if (c.getYearlySalary() >= 10000 && c.getYearlySalary() < 50000) {
            ccCreator = new BasicCCreator();
        } else if (c.getYearlySalary() >= 50000 && c.getYearlySalary() <= 100000) {
            ccCreator = new PremiumCCreator();
        } else if (c.getYearlySalary() > 100000) {
            ccCreator = new VipCCreator();
        } else {
            return null;
        }
        return ccCreator.buildCard(c);
    }
}
