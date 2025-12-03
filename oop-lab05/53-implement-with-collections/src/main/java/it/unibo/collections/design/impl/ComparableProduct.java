package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ComparableProduct extends ProductImpl implements Comparable<Product>{

    public ComparableProduct(String nameString, double quantity) {
        super(nameString, quantity);
    }

    @Override
    public int compareTo(Product o) {
        return getName().compareTo(o.getName());
    }

}
