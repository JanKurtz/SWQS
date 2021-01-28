package com.mycompany.app.Aufgabe5;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class VendingMachineTestMock {

    private VendingMachineImpl vendingMachine;
    private Box fullBox1;
    private Box fullBox2;
    private CashBox unlimitedCashBox;

    @Before
    public void setUp() {
        unlimitedCashBox = mock(CashBox.class);
        fullBox1 = mock(Box.class);
        fullBox2 = mock(Box.class);
        Box[] boxArray = {fullBox1, fullBox2};
        vendingMachine = new VendingMachineImpl(unlimitedCashBox, boxArray);
    }
    @Test
    public void testEnoughMoney() throws BoxEmptyException, NotEnoughMoneyException {
        when(fullBox2.getPrice()).thenReturn(1);
        when(unlimitedCashBox.getCurrentAmount()).thenReturn(Integer.MAX_VALUE);
        vendingMachine.selectItem(1);

        verify(fullBox2).releaseItem();
        verify(unlimitedCashBox).withdraw(1);
    }
}
