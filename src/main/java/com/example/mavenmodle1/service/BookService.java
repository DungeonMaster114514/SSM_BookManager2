package com.example.mavenmodle1.service;

import com.example.mavenmodle1.bookList.Book;
import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> selectBookByName(String bookName);
    Book selectBookByID(int bookID);
    List<Book> selectAllBook();
    void deleteBookByID(int bookID);
    void updateBook(Book book);
}
