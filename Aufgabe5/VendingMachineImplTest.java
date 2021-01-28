package com.mycompany.app.Aufgabe5;

import org.junit.Test;

public class VendingMachineImplTest {
    @Test
    public void testEnoughMoney() throws BoxEmptyException, NotEnoughMoneyException {
        UnlimitedCashBox unlimitedCashBox = new UnlimitedCashBox();
        FullBox fullBox1 = new FullBox();
        FullBox fullBox2 = new FullBox();
        Box[] boxArray = {fullBox1, fullBox2};
        VendingMachineImpl vendingMachine = new VendingMachineImpl(unlimitedCashBox, boxArray);

        vendingMachine.selectItem(1);

    }
}
