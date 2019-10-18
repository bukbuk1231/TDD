package com.virtualpairprogrammers.isbntools;

public class ValidISBN {

    public boolean checkISBN(String isbn) {
        if (isbn.length() == 13) {
            int total = 0;
            for (int i = 0; i < 13; i++) {
                if (i % 2 == 0) {
                    total += Character.getNumericValue(isbn.charAt(i));
                } else {
                    total += Character.getNumericValue(isbn.charAt(i)) * 3;
                }
            }

            if (total % 10 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (isbn.length() != 10) {
                throw new NumberFormatException("ISBN Number Must Be 10 Digits");
            }

            int total = 0;
            for (int i = 0; i < 10; i++) {
                if (!Character.isDigit(isbn.charAt(i))) {
                    if (i == 9 && isbn.charAt(i) == 'X') {
                        total += 10;
                    } else {
                        throw new NumberFormatException("ISBN Number Can Only Contain Numeric Digits");
                    }
                }
                total += Character.getNumericValue(isbn.charAt(i)) * (10 - i);
            }
            if (total % 11 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
