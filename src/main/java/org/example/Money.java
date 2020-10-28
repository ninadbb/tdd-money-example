package org.example;

public class Money {
    protected int amount;
    protected String currency;

    protected Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    public String currency() {
        return currency;
    }

    public String toString() {
        return amount + " " + currency;
    }
}
