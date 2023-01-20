package model;

public class Card {
    private int pin;
    private BankAccount account;

    public Card(int pin, BankAccount account) {
        this.pin = pin;
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public int getPin() {
        return pin;
    }
}
