package ru.itpark.domain;

public class PC extends Product {
    String characteristics;

    public PC(String category, int id, int price, String name, String characteristics) {
        super(category, id, price, name);
        this.characteristics = characteristics;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public String toString() {
        return "\nPC{" +
                "characteristics='" + characteristics + '\'' +
                ", " + super.toString();
    }
}
