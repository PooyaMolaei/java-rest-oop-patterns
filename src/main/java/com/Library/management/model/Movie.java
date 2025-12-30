package com.Library.management.model;

public class Movie extends Resource{
    private String director;

    public Movie(long id, String title,  String director) {
        super(id,title);
        this.director = director;
    }

    public String getDirector() { return director; }

    @Override
    public double calculateLateFee (int days) {
        return days * 2.00;
    }
}
