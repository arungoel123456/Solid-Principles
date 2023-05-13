package com.demo.isp;

import java.awt.print.*;

public interface BookActions {
    void addBook(Book book);
    void removeBook(Book book);
    void searchBooks(String keyword);
}
