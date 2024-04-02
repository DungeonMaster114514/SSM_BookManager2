package com.example.mavenmodle1.service;

import com.example.mavenmodle1.bookList.Book;
import com.example.mavenmodle1.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService{
    @Autowired
    BookMapper bookMapper;

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public List<Book> selectBookByName(String bookName) {
        return bookMapper.selectBookByName(bookName);
    }

    @Override
    public Book selectBookByID(int bookID) {
        return bookMapper.selectBookByID(bookID);
    }

    @Override
    public List<Book> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    public void deleteBookByID(int bookID) {
        bookMapper.deleteBookByID(bookID);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }
}
