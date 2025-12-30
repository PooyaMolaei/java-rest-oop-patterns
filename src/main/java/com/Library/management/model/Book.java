package com.Library.management.model;

public class Book extends Resource{
    private String auther;
    private String title;

    public Book (long id, String title, String auther) {
        super(id,title);
        this.auther = auther;

    }

    public String getAuther() {
        return auther;
    }

    @Override
    public double calculateLateFee (int days) {
        return days * 0.50;
    }
}
