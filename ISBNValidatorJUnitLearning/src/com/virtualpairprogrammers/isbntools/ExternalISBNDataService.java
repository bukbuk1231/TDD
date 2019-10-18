package com.virtualpairprogrammers.isbntools;

import com.virtualpairprogrammers.isbntools.Book;

public interface ExternalISBNDataService {

    public Book lookup(String isbn);

}
