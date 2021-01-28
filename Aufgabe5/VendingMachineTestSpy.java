package com.mycompany.app.Aufgabe5;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class VendingMachineTestSpy {
    private VendingMachineImpl vendingMachine;
    private FullBox fullBox1;
    private FullBox fullBox2;
    private UnlimitedCashBox unlimitedCashBox;

    @Before
    public void setUp() {
        unlimitedCashBox = spy(UnlimitedCashBox.class);
        fullBox1 = spy(new FullBox());
        fullBox2 = spy(new FullBox());
        Box[] boxArray = {fullBox1, fullBox2};
        vendingMachine = new VendingMachineImpl(unlimitedCashBox, boxArray);
    }
    @Test
    public void testEnoughMoney() throws BoxEmptyException, NotEnoughMoneyException {
        vendingMachine.selectItem(1);

        verify(fullBox2).releaseItem();
        verify(unlimitedCashBox).withdraw(42);
    }
}
