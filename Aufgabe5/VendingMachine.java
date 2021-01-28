package com.mycompany.app.Aufgabe5;

public interface VendingMachine {

    public void selectItem(int boxIndex) throws
            NotEnoughMoneyException,
            BoxEmptyException;

}
