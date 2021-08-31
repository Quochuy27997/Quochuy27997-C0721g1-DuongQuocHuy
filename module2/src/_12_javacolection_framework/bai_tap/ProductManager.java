package _12_javacolection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class ProductManager {
    static ArrayList<Product> products= new ArrayList<Product>();
    static {
        products.add(new Product(1,"iphone",25000));
        products.add(new Product(2,"samsung",20000));
        products.add(new Product(3,"sony",15000));
        products.add(new Product(4,"vsmart",10000));
    }
    public static void disPlayProduct(){
        for (Product product:products){
            System.out.println(product.toString());
        }
    }
    public static void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of product:");
        int idProduct = Integer.parseInt(input.nextLine());
        System.out.println("Enter name of product:");
        String nameProduct = input.nextLine();
        System.out.println("Enter price of product:");
        int priceProduct = Integer.parseInt(input.nextLine());
        products.add(new Product(idProduct,nameProduct,priceProduct));

    }
}
