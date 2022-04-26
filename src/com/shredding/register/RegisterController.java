package com.shredding.register;


public class RegisterController{
    private RegistartionInterface regInterface;


    public boolean registerUser(UserRegistrationForm form){
        return RegistrationService.registerUser(form);
    }
    public boolean registerAdmin(AdminRegistrationForm form){
        return RegistrationService.registerAdmin(form);
    }
}
