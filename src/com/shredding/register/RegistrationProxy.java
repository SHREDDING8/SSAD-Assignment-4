package com.shredding.register;

public class RegistrationProxy {
    private RegistartionInterface service;

    public boolean registerUser(RegistrationForm form){
        return false;
    }
    public boolean registerAdmin(RegistrationForm form){
        return false;
    }

    public boolean checkAccessToCreateAdmin(String password){
        return false;
    }
}
