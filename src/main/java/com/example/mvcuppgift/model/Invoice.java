package com.example.mvcuppgift.model;

public class Invoice {
private String title;
private String description;
private String category;
private double price;

private String username;

private String date;

    public Invoice(String title,String description, String category, double price, String username) {
        this.title= title;
        this.description= description;
        this.category = category;
        this.price = price;
        this.username = username;
    }

    public Invoice(){

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", username='" + username + '\'' +
                '}';
    }
}
