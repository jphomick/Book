package com.company;

public class Main {

    public static void main(String[] args) {
        Book b = new Book("Cave344", "20 Years of Caving", "Rock Boulvis",
                "Take a trip with legendary caver Rock Boulvis as he recounts 20 years of exciting" +
                        " and dangerous caving experience.",
                20);
        System.out.println(b.getDisplayText());
        System.out.println(b.showPriceFor(12));
        b.setInStock(true);
        System.out.println(b.showPriceFor(12));

        BookDatabase database = new BookDatabase();
        b = new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates",
                "Easy to read Java workbook",
                47.50);
        database.addBook(b);
        b = new Book("Java1002", "Thinking in Java", "Bruce Eckel",
                "Details about Java under the hood",
                20.00);
        database.addBook(b);
        b = new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky",
                "Everything you need to know in one place",
                45.00);
        database.addBook(b);
        b = new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart",
                "Fun with Python",
                10.50);
        database.addBook(b);
        b = new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",
                16.50);
        database.addBook(b);
        b = new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norri",
                "A dozen fiendishly fun projects for the Raspberry Pi!",
                14.75);
        database.addBook(b);

        System.out.println();
        System.out.println(database.findBook("Java1001").getDisplayText());
    }
}
