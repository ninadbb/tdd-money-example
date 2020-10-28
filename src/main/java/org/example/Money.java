package org.example;

public abstract class Money {
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

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    public String currency() {
        return currency;
    }
}
