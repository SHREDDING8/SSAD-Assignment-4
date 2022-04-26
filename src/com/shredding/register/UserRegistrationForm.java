package com.shredding.register;

public class UserRegistrationForm {
    public String name;
    public String password;
    public String creditCard;
    public String address;

    public UserRegistrationForm(String name, String password, String creditCard, String address){
        this.name = name;
        this.password = password;
        this.creditCard = creditCard;
        this.address = address;
    }
}
