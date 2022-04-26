package com.shredding.register;

import com.shredding.VirtualDatabase.VirtualDatabase;
import com.shredding.user.User;

public class RegistrationService {

    public void registerUser(UserRegistrationForm form){
        User newUser = new User(form.name, form.password, form.address, form.creditCard);
        VirtualDatabase.addUser(newUser);

    }
    public void registerAdmin(AdminRegistrationForm form){
        User newUser = new User(form.name, form.password, form.address, form.creditCard);
        VirtualDatabase.addUser(newUser);
    }
}
