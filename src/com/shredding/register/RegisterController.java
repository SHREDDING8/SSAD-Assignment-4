package com.shredding.register;


public class RegisterController{
    private RegistartionInterface regInterface;


    public boolean registerUser(UserRegistrationForm form){
        return RegistrationProxy.registerUser(form);
    }
    public boolean registerAdmin(AdminRegistrationForm form){
        return RegistrationProxy.registerAdmin(form);
    }
}
