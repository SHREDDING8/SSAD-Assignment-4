package com.shredding.buying.factory;

import com.shredding.buying.Product.Category;
import com.shredding.buying.Product.Product;

public class Factory {
    // pattern Factory
    public static Product createProduct(String name, String[] features, double price, Category category){
        // we get request from user to create some product and creating it
        Product newProduct;
        switch (category){
            case Bike -> newProduct = BikeFactory.createBike();
            case BikePart -> newProduct =  BikePartFactory.createBikePart();
            case BikeInventory -> newProduct =  BikeInventoryFactory.createBikeInventory();
            default -> throw new IllegalStateException("Unexpected value: " + category);
        }

        newProduct.name = name;
        newProduct.features = features;
        newProduct.price=price;

        return newProduct;
    }

}
