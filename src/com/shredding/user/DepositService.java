package com.shredding.user;

public class DepositService {
    // The class and method deposit add some deposit to some user's Balance
    public static void deposit(User user, double amount){
        // checking valid amount
        if (amount<=0){
            System.out.println("Deposit can not be negative or equal to zero.");
        }else{
            user.Balance+=amount;
            System.out.println("Successful");
        }
    }
}
