package com.mycompany.app.Aufgabe4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStringTest {

    private MyString myString;
    private Object anObject;
    private Boolean result;

    @Test
    public void testSameObject() {
        //Set up
        myString = new MyString("a");
        anObject = myString;
        //Execute
        result=myString.equals(anObject);
        //Verify
        assertTrue("Sollte true sein, weil gleiches Objekt", result);
        //Teardown
        myString=null;
        anObject=null;
        result=null;
    }
    @Test
    public void testDifferentType() {
        //Set up
        myString = new MyString("a");
        anObject = new String("a");
        //Execute
        result=myString.equals(anObject);
        //Verify
        assertFalse("Sollte false sein, weil Objekt keine Instanz von myString", result);
        //Teardown
        myString=null;
        anObject=null;
        result=null;
    }
    @Test
    public void testSameString() {
        //Set up
        myString = new MyString("a");
        anObject = new MyString("a");
        //Execute
        result=myString.equals(anObject);
        //Verify
        assertTrue("Sollte true sein, weil Objekt Instanz von myString ist und den selben Inhalt hat", result);
        //Teardown
        myString=null;
        anObject=null;
        result=null;
    }
    @Test
    public void testDifferentString() {
        //Set up
        myString = new MyString("a");
        anObject = new MyString("b");
        //Execute
        result=myString.equals(anObject);
        //Verify
        assertFalse("Sollte false sein, weil Objekt zwar Instanz von myString ist aber nicht den selben Inhalt hat", result);
        //Teardown
        myString=null;
        anObject=null;
        result=null;
    }
    @Test
    public void testDifferentStringLoop() {
        //Set up
        myString = new MyString("aa");
        anObject = new MyString("ab");
        //Execute
        result=myString.equals(anObject);
        //Verify
        assertFalse("Sollte false sein, weil Objekt zwar Instanz von myString ist aber nicht den selben Inhalt hat", result);
        //Teardown
        myString=null;
        anObject=null;
        result=null;
    }
    @Test
    public void testDifferentLength() {
        //Set up
        myString = new MyString("ab");
        anObject = new MyString("abc");
        //Execute
        result=myString.equals(anObject);
        //Verify
        assertFalse("Sollte false sein, weil die Objekte eine unterschiedliche Länge haben", result);
        //Teardown
        myString=null;
        anObject=null;
        result=null;
    }
    @Test
    public void testEmpty() {
        //Set up
        myString = new MyString("");
        anObject = new MyString("");
        //Execute
        result=myString.equals(anObject);
        //Verify
        assertTrue("Sollte true sein, weil Objekt Instanz von myString ist und den selben Inhalt hat", result);
        //Teardown
        myString=null;
        anObject=null;
        result=null;
    }
}
