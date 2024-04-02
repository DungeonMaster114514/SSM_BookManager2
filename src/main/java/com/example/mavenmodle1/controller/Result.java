package com.example.mavenmodle1.controller;

public class Result {
    private Object book;
    private int type;
    private String msg;

    public Result(Object book, int type, String msg) {
        this.book = book;
        this.type = type;
        this.msg = msg;
    }

    public Result(int type) {
        this.type = type;
    }

    public Result(Object book, int type) {
        this.book = book;
        this.type = type;
    }

    public Result(){}

    public Object getBook() {
        return book;
    }

    public void setBook(Object book) {
        this.book = book;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
