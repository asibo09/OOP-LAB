package it.unibo.collections.design.impl;

import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;


public class WarehouseImpl implements Warehouse {

    private final Set<Product> set = newSet();

    private static <E> Set<E> newSet() {
        return new LinkedHashSet<>();
    }

    private static <E> Set<E> newSetFrom(final Collection<E> origin) {
        return new LinkedHashSet<>(origin);
    }

    @Override
    public void addProduct(Product p) {
        set.add(p);
    }

    @Override
    public Set<String> allNames() {
        final Set<String> s= newSet();
        for(final Product p : this.set){
            s.add(p.getName());
        }
        return s;
    }

    @Override
    public Set<Product> allProducts() {
        return newSetFrom(this.set);
    }

    @Override
    public boolean containsProduct(Product p) {
        return set.contains(p);
    }

    @Override
    public double getQuantity(String name) {
        for(final var p: this.set){
            if (p.getName().equals(name)) {
                return p.getQuantity();
            }
        }
        return 0;
    }

}
