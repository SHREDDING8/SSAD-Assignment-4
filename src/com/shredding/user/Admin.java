package com.shredding.user;

import com.shredding.VirtualDatabase.VirtualDatabase;

public class Admin extends User{

    public Admin(String name, String password, String address, String CreditCard) {
        super(name, password, address, CreditCard);
    }

    public void lendBike(User renter, int bikeId,int days){
        renter.rentedBike = VirtualDatabase.getProduct(bikeId);
        renter.rentedDays=days;
    }
}
