package FactoryMethod;
import java.time.LocalDate;
public class PremiumCCreator extends CCreator{
    @Override
    public CreditCard buildCard(Cliente c) {
        PremiumCC cc = new PremiumCC();
        LocalDate today = LocalDate.now();
        cc.setCardNumber(super.genCardNumber());
        cc.setCardHolderName(c.getName() + c.getLastName());
        cc.setCardExpiryDate(today.plusYears(3));
        cc.setCvv(super.genCVV());
        cc.setCardBalance(0);
        cc.setYearlyCardLimit(50000);
        cc.setCardType("Premium");
        cc.setInterestRate(0.08);
        cc.setYearlyPayment(150);
        return cc;
    }
}