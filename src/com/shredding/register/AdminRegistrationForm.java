package com.shredding.register;

public class AdminRegistrationForm {
    public String name;
    public String password;
    public String creditCard;
    public String address;
    public String passwordToCreateAdmin;

    public AdminRegistrationForm(String name, String password, String creditCard, String address,String passwordToCreateAdmin){
        this.name = name;
        this.password = password;
        this.creditCard = creditCard;
        this.address = address;
        this.passwordToCreateAdmin = passwordToCreateAdmin;
    }
}
