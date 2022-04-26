package com.shredding.user;

import com.shredding.buying.Product.Product;

public class User {
    private static int id_private;
    public int id;
    public String Name;
    public String Password;
    public double Balance;
    public String Address;
    public String CreditCard;

    public Product rentedBike;
    public int rentedDays;
//    public Product[] Cart;

    public User(String name,String password,String address,String CreditCard){
        id_private++;
        id = id_private;
        this.Name = name;
        this.Password = password;
        this.Address = address;
        this.CreditCard = CreditCard;
        this.Balance = 0;
    }
    public void deposit(double amount){
        DepositService.deposit(this,amount);
    }

//    public addToCart
//    public void buyProductsInCart()

}
