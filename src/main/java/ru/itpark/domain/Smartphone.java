package ru.itpark.domain;

public class Smartphone extends Product {
    private String  color;
    private int memory;


    public Smartphone(String category, int id, int price, String name) {
        super(category, id, price, name);
    }


}
