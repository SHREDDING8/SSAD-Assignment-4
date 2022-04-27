package com.shredding.register;


public class RegisterController{
    public boolean registerUser(UserRegistrationForm form){
        // we call function from RegistrationProxy that check from valid
        return RegistrationProxy.registerUser(form);
    }
    public boolean registerAdmin(AdminRegistrationForm form){
        // we call function from RegistrationProxy that check from valid
        return RegistrationProxy.registerAdmin(form);
    }
}
