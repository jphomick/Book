package com.company;

public class Book {
    private String title, author, description;
    private double price;
    private boolean isInStock;
    private String id;

    Book(String id) {
        this.title = "";
        this.author = "";
        this.description = "";
        this.price = 0;
        isInStock = false;
        this.id = id;
    }

    Book(String id, String title, String author, String description, double price) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        isInStock = false;
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getDisplayText() {
        return title + "\nBy " + author + "\n---\n" + description;
    }

    public double getQuota(int books) {
        if (isInStock) {
            return Double.valueOf(String.format("%.2f", books * price));
        } else {
            return -1;
        }
    }

    public String showPriceFor(int books) {
        double quota = getQuota(books);
        if (quota > 0) {
            return "$" + String.format("%.2f", quota) + " for " + books + " of " + title + " by " + author;
        } else if (quota == -1) {
            return title + " is not in stock.";
        } else {
            return "Invalid number.";
        }
    }
}
