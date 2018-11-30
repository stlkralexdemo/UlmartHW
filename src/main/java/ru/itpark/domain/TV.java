package ru.itpark.domain;

public class TV extends Product {
    int size;

    public TV(String category, int id, int price, String name, int size) {
        super(category, id, price, name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nTV{" +
                "size=" + size +
                ", " + super.toString();
    }
}
