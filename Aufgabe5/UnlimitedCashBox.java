package com.mycompany.app.Aufgabe5;

public class UnlimitedCashBox implements CashBox {
    @Override
    public int getCurrentAmount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void withdraw(int amountRequired) {
    }
}
