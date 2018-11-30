package ru.itpark;

import ru.itpark.comparator.ItemsPriceAscComparator;
import ru.itpark.domain.*;
import ru.itpark.repository.ProductRepository;

public class Main {
    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        repository.add(new Smartphone("Smart", 1, 30_000, "Xiaomi", "black", 64));
        repository.add(new Smartphone("Smart", 2, 20_000, "Honor", "black", 128));
        repository.add(new Smartphone("Smart", 3, 40_000, "Fly", "white", 32));
        repository.add(new Smartphone("Smart", 7, 30_000, "Fly", "white", 16));

        repository.add(new TV("TV", 4, 70_000, "BBK", 55));
        repository.add(new TV("TV", 9, 40_000, "Honor", 65));
        repository.add(new PC("PC", 5, 48_000, "Acer", "Core i5, GTX 1070"));

        repository.add(new TShirt("TShirt", 65, 350, "Moddis", "red", "XXL"));

        System.out.println(repository.getAll());

        System.out.println(repository.getItemsByName("Honor"));

        System.out.println(repository.getByCategory("Smart"));

        System.out.println(repository.getByPrice());
    }
}
