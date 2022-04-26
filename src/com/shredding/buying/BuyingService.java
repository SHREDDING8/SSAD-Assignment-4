package com.shredding.buying;


import com.shredding.VirtualDatabase.VirtualDatabase;

public class BuyingService {

    public static void buyProducts(int[] productsId){
        VirtualDatabase.getProductRange(productsId);
    }

}
