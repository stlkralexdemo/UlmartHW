package ru.itpark.domain;

public class TShirt extends Product {
    String color;
    String size;

    public TShirt(String category, int id, int price, String name, String color, String size) {
        super(category, id, price, name);
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nTShirt{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", " + super.toString();
    }
}
