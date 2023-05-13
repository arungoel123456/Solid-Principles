package com.demo.without.isp;

import java.awt.print.*;

public interface LibraryActions {
    void addBook(Book book);
    void removeBook(Book book);
    void searchBooks(String keyword);
    void notifyUsers(Book book);
}
