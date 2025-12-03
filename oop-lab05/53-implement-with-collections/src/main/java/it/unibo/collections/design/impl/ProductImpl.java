package it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product {

    final String nameString;
    final double quantity;
    
    public ProductImpl(String nameString, double quantity) {
        super();
        this.nameString = nameString;
        this.quantity = quantity;
    }

    public String getName() {
        return this.nameString;
    }

    @Override
    public double getQuantity() {
        return this.quantity;
    }

}
