package FactoryMethod;
import java.time.LocalDate;
public class BasicCC implements CreditCard{
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
        return payIn6months(amount);
    }
    @Override
    public void credit(double d) {
        cardBalance+=d;
    }

    @Override
    public void debit(double d) {
        cardBalance-=d;
    }
    public boolean payIn6months(double amount){
        // request payments in 3 months
        // if payment is successful, update balance every month
        // return true;
        // if payment is unsuccessful, deny the request
        // return false;
        // All of this requests are sended every month.
        // month 1:
        debit(amount/6);
        // month 2:
        debit(amount/6);
        // month 3:
        debit(amount/6);
        // month 4:
        debit(amount/6);
        // month 5:
        debit(amount/6);
        // month 6:
        debit(amount/6);
        return true;
    }
}