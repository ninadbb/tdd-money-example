package org.example;

public abstract class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
