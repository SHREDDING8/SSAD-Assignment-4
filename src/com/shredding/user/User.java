package com.shredding.user;

import com.shredding.VirtualDatabase.VirtualDatabase;
import com.shredding.buying.Product.Product;

import java.util.ArrayList;

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
    public ArrayList<Integer> cart = new ArrayList<Integer>();

    public User(String name, String password, String address, String CreditCard) {
        id_private++;
        id = id_private;
        this.Name = name;
        this.Password = password;
        this.Address = address;
        this.CreditCard = CreditCard;
        this.Balance = 0;
    }

    public void deposit(double amount) {
        // this function call function from class DepositService to add some money to user Balance
        DepositService.deposit(this, amount);
    }

    public void addToCart(int ProductId) {
        // adding some product to user cart
        cart.add(ProductId);
    }

    public void buyProductsInCart() {
        // function allows buy some products from user cart
        for (Integer integer : cart) {
            // getting product
            Product someProduct = VirtualDatabase.getProduct(integer);
            assert someProduct != null;
            if (Balance >= someProduct.price) {
                // checking balance
                this.Balance-=someProduct.price;
                System.out.println("Buying of " + someProduct.name + " successful");
            } else {
                System.out.println("Your balance is smaller than price of " + someProduct.name);
            }
        }
    }

}
