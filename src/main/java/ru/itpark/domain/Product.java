package ru.itpark.domain;

public abstract class Product {
    private String category;
    private int id;
    private int price;
    private String name;

    public Product(String category, int id, int price, String name) {
        this.category = category;
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "category='" + category + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
