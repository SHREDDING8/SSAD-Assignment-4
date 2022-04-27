package com.shredding.buying.factory;

import com.shredding.buying.Product.BikePart;
import com.shredding.buying.Product.Product;

public class BikePartFactory {
    public static Product createBikePart(){
        // creating some BikePart
        return new BikePart();
    }
}
