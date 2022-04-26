package com.shredding.register;

import com.shredding.VirtualDatabase.VirtualDatabase;
import com.shredding.user.User;

import java.util.ArrayList;

public class RegistrationProxy {
    private RegistartionInterface service;

    public static boolean registerUser(UserRegistrationForm form){
        ArrayList<User> users = VirtualDatabase.getAllUsers();

        for (int i = 0; i < users.size(); i++) {
            if(form.name.equals(users.get(i)) ){
                return false;
            }
        }
        return true;

    }
    public static boolean registerAdmin(AdminRegistrationForm form){
        ArrayList<User> users = VirtualDatabase.getAllUsers();

        for (int i = 0; i < users.size(); i++) {
            if(form.name.equals(users.get(i)) ){
                return false;
            }
        }
        return true;
    }

    public static boolean checkAccessToCreateAdmin(String password){
        return password.equals("createAdmin");
    }
}
