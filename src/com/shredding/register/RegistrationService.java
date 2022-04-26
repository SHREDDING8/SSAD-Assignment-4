package com.shredding.register;

import com.shredding.VirtualDatabase.VirtualDatabase;
import com.shredding.user.User;

public class RegistrationService {

    public static boolean registerUser(UserRegistrationForm form){
        if (RegistrationProxy.registerUser(form)){
            User newUser = new User(form.name, form.password, form.address, form.creditCard);
            VirtualDatabase.addUser(newUser);
            return true;
        }
        return false;
    }
    public static boolean registerAdmin(AdminRegistrationForm form){
        if (RegistrationProxy.registerAdmin(form) && RegistrationProxy.checkAccessToCreateAdmin(form.passwordToCreateAdmin)){
            User newUser = new User(form.name, form.password, form.address, form.creditCard);
            VirtualDatabase.addUser(newUser);
            return true;
        }
        return false;
    }
}
