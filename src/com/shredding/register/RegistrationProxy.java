package com.shredding.register;

import com.shredding.VirtualDatabase.VirtualDatabase;
import com.shredding.user.User;

import java.util.ArrayList;

public class RegistrationProxy {
    private static final RegistrationService service = new RegistrationService();

    public static boolean registerUser(UserRegistrationForm form){
        // checking uniq user
        ArrayList<User> users = VirtualDatabase.getAllUsers();

        for (User user : users) {
            if (form.name.equals(user.Name)) {
                return false;
            }
        }
        service.registerUser(form);
        return true;

    }
    public static boolean registerAdmin(AdminRegistrationForm form){
        // checking uniq user
        ArrayList<User> users = VirtualDatabase.getAllUsers();

        for (User user : users) {
            if (form.name.equals(user.Name)) {
                return false;
            }
        }
        // checking password to create admin
        if(checkAccessToCreateAdmin(form.passwordToCreateAdmin)){
            service.registerAdmin(form);
            return true;
        }
        return false;
    }

    public static boolean checkAccessToCreateAdmin(String password){
        return password.equals("createAdmin");
    }
}
