package com.shredding.VirtualDatabase;

import com.shredding.buying.Product.Category;
import com.shredding.buying.Product.Product;
import com.shredding.buying.factory.Factory;
import com.shredding.user.User;

import java.util.ArrayList;

public class VirtualDatabase {
    // base of products
    private static ArrayList<Product> products = new ArrayList<Product>();
    // base of users
    private static ArrayList<User> users = new ArrayList<User>();

    public static Product getProduct(int ProductId) {
        // getting product
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == ProductId){
                return products.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Product> getProductRange(int[] ProductsId) {
        // getting several products
        ArrayList<Product> productsRange = new ArrayList<Product>();

        for (int i = 0; i < ProductsId.length; i++) {

            for (int j = 0; j < products.size(); j++) {
                if (products.get(j).id== ProductsId[i]){
                    productsRange.add(products.get(j));
                    break;
                }
            }
        }
        return productsRange;
    }

    public static User getUser(int userId) {
        // getting user from database
        for (User user : users) {
            if (user.id == userId) {
                return user;
            }
        }
        return null;
    }

    public static ArrayList<User> getAllUsers(){
        return users;
    }
    public static ArrayList<Product> getAllProducts(){
        return products;
    }

    public static void addProduct(String name, String[] features, double price, Category category) {
        // creating and adding some product to database
        products.add(Factory.createProduct(name,features,price,category));
    }
    public static void addUser(User user){
        users.add(user);
    }

}
