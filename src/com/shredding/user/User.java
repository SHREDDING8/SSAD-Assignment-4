package com.shredding.user;

public class User {
    public String Name;
    public String Password;
    public double Balance;
    public String Address;
    public String CreditCard;
//    public Product[] Cart;

    public User(String name,String password,String address,String CreditCard){
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
