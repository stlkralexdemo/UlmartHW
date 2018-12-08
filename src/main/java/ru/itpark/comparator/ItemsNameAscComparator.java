package ru.itpark.comparator;

import ru.itpark.domain.Product;

import java.io.Serializable;
import java.util.Comparator;

public class ItemsNameAscComparator implements Comparator <Product>, Serializable {


    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
