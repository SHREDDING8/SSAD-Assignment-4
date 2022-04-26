package com.shredding.buying.factory;

import com.shredding.buying.Product.Bike;
import com.shredding.buying.Product.Product;

public class BikeFactory {
    public static Product createBike(){
        return new Bike();
    }
}
