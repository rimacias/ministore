package FactoryMethod;
import java.time.LocalDate;
public class PremiumCC implements CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private LocalDate cardExpiryDate;
    private String cvv;
    private double cardBalance;
    private double yearlyCardLimit;
    private String cardType;
    private double interestRate;
    private double yearlyPayment;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public LocalDate getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(LocalDate cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public double getYearlyCardLimit() {
        return yearlyCardLimit;
    }

    public void setYearlyCardLimit(double yearlyCardLimit) {
        this.yearlyCardLimit = yearlyCardLimit;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getYearlyPayment() {
        return yearlyPayment;
    }

    public void setYearlyPayment(double yearlyPayment) {
        this.yearlyPayment = yearlyPayment;
    }
    
    @Override
    public boolean makePayment(double amount) {
        if (cardBalance > amount / 6) {
            return payIn3months(amount);
        } else {
            return false;
        }
    }
    @Override
    public void credit(double amount) {
        cardBalance += amount;
    }
    @Override
    public void debit(double amount) {
        cardBalance -= amount;
    }
    public boolean payIn3months(double amount) {
        // request payments in 3 months
        // if payment is successful, update balance every month
        // return true;
        // if payment is unsuccessful, deny the request
        // return false;
        // month 1:
        // All of this requests are sended every month.
        debit(amount / 3);
        // month 2:
        debit(amount / 3);
        // month 3:
        debit(amount / 3);
        return true;
    }
}