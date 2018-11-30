package ru.itpark.repository;

import ru.itpark.comparator.ItemsNameAscComparator;
import ru.itpark.comparator.ItemsPriceAscComparator;
import ru.itpark.domain.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepository {
    private List<Product> items = new ArrayList<>();

    public void add(Product item) {
        items.add(item);
    }

    public List<Product> getAll() {
        return items;
    }

    public List<Product> getItemsByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product item : items) {
            if (item.getName().equals(name)) {
                result.add(item);
            }
        }
        result.sort(new ItemsNameAscComparator());

        return result;
    }

    public List<Product> getByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product item : items) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }
        result.sort(new ItemsNameAscComparator());

        return result;
    }

    public List<Product> getByPrice(Comparator comparator) {
        items.sort(new ItemsPriceAscComparator());
        return items;
    }
}

