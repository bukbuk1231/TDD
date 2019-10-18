package com.virtualpairprogammers.isbntools;

import com.virtualpairprogrammers.isbntools.ValidISBN;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTests {

    @Test
    public void checkAValidISBN() {
        ValidISBN validator = new ValidISBN();
        boolean res = validator.checkISBN("0140449116");
            assertTrue(res);
    }

    @Test
    public void checkAValid13DigitISBN() {
        ValidISBN validator = new ValidISBN();
        boolean res = validator.checkISBN("9781853260087");
        assertTrue(res);
    }

    @Test
    public void checkAnInvalidISBN() {
        ValidISBN validator = new ValidISBN();
        boolean res = validator.checkISBN("0140449117");
        assertFalse(res);
    }

    @Test
    public void checkAnInvalid13DigitISBN() {
        ValidISBN validator = new ValidISBN();
        boolean res = validator.checkISBN("9781853267336");
        assertFalse(res);
    }

    @Test(expected = NumberFormatException.class)
    public void nineDigitISBNAreNotAllowed() {
        ValidISBN validator = new ValidISBN();
        boolean res = validator.checkISBN("123456789");
    }

    @Test(expected = NumberFormatException.class)
    public void noneNumericISBNAreNotAllowed() {
        ValidISBN validator = new ValidISBN();
        boolean res = validator.checkISBN("helloworld");
    }

    @Test
    public void ISBNNumbersEndingInAnXAreValid() {
        ValidISBN validator = new ValidISBN();
        boolean res = validator.checkISBN("012000030X");
        assertTrue(res);
    }
}
