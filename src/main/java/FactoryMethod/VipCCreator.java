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
public class VipCCreator extends CCreator {

    @Override
    public CreditCard buildCard(Cliente c) {
        VipCC cc = new VipCC();
        LocalDate today = LocalDate.now();
        cc.setCardNumber(super.genCardNumber());
        cc.setCardHolderName(c.getName() + c.getLastName());
        cc.setCardExpiryDate(today.plusYears(5));
        cc.setCvv(super.genCVV());
        cc.setCardBalance(0);
        cc.setYearlyCardLimit(150000);
        cc.setCardType("VIP");
        cc.setInterestRate(0.12);
        cc.setYearlyPayment(320);
        return cc;
    }
}
