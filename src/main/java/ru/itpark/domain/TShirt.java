package ru.itpark.domain;

public class TShirt extends Product {
    int color;
    String size;

    public TShirt(String category, int id, int price, String name) {
        super(category, id, price, name);
    }
}
