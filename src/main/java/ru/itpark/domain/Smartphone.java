package ru.itpark.domain;

public class Smartphone extends Product {
    private String  color;
    private int memory;


    public Smartphone(String category, int id, int price, String name, String color, int memory) {
        super(category, id, price, name);
        this.color = color;
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "\nSmartphone{" +
                "color='" + color + '\'' +
                ", memory=" + memory +
                ", " + super.toString();
    }
}
