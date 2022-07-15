/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import java.time.LocalDate;

/**
 *
 * @author ramon
 */
public class PremiumCCreator extends CCreator{

    @Override
    public CreditCard buildCard(Cliente c) {
        BasicCC cc = new BasicCC();
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
