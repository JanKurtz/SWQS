package com.mycompany.app.Aufgabe5;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException() {
        super("Not enough money");
    }
}
