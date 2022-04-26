package com.shredding.buying.factory;

import com.shredding.buying.Product.BikeInventory;
import com.shredding.buying.Product.Category;
import com.shredding.buying.Product.Product;

public class BikeInventoryFactory {
    public static Product createBikeInventory(){
        return new BikeInventory();
    }
}
