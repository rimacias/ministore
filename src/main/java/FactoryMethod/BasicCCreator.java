package FactoryMethod;
import java.time.LocalDate;
public class BasicCCreator extends CCreator{
    @Override
    public CreditCard buildCard(Cliente c) {
        BasicCC cc = new BasicCC();
        LocalDate today = LocalDate.now();
        cc.setCardNumber(super.genCardNumber());
        cc.setCardHolderName(c.getName()+c.getLastName());
        cc.setCardExpiryDate(today.plusYears(2));
        cc.setCvv(super.genCVV());
        cc.setCardBalance(0);
        cc.setYearlyCardLimit(25000);
        cc.setCardType("Basic");
        cc.setInterestRate(0.05);
        cc.setYearlyPayment(80);
        return cc;
    }
}