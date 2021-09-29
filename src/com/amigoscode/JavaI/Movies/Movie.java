package com.amigoscode.JavaI.Movies;

public class Movie {
    private String name;
    private String category;

    //Constructor:
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    //Getters & Setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
