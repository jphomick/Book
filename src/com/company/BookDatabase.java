package com.company;

import java.util.ArrayList;

public class BookDatabase {

    ArrayList<Book> database = new ArrayList<>();

    public boolean addBook(Book newBook) {
        boolean canAdd = true;
        for (Book book : database) {
            if (book.getId().equals(newBook.getId())) {
                canAdd = false;
            }
        }
        if (canAdd) {
            database.add(newBook);
            return true;
        } else {
            return false;
        }
    }

    public Book findBook(String id) {
        for (Book book : database) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
}
