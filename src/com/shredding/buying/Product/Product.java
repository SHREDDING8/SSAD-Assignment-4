package com.shredding.buying.Product;

public abstract class Product {
    private static int id_private;
    public final int id;
    public String name;
    public String[] features;
    public double price;
    public Category category;

    public Product(Category category){
        id_private++;
        this.id = id_private;
        this.category=category;
    }
}
