package ru.itpark.domain;

public class PC extends Product {
    String characteristics;

    public PC(String category, int id, int price, String name) {
        super(category, id, price, name);
    }
}
