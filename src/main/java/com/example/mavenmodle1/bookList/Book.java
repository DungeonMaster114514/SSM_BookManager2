package com.example.mavenmodle1.bookList;

public class Book {
    private int bookID;
    private String bookType;
    private String bookName;
    private String detail;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookType='" + bookType + '\'' +
                ", bookName='" + bookName + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
