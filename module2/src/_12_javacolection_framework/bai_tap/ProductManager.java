package _12_javacolection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    static ArrayList<Product> products = new ArrayList<Product>();

    static {
        products.add(new Product(1, "iphone", 25000));
        products.add(new Product(2, "samsung", 20000));
        products.add(new Product(3, "sony", 15000));
        products.add(new Product(4, "vsmart", 10000));
    }

    public static void displayProduct() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public static void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of product:");
        int idProduct = Integer.parseInt(input.nextLine());
        System.out.println("Enter name of product:");
        String nameProduct = input.nextLine();
        System.out.println("Enter price of product:");
        int priceProduct = Integer.parseInt(input.nextLine());
        products.add(new Product(idProduct, nameProduct, priceProduct));
        displayProduct();
    }

    public static void editProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of product:");
        int idProduct = Integer.parseInt(input.nextLine());
        System.out.println("Enter new name of product:");
        String nameProduct = input.nextLine();
        System.out.println("Enter new price of product:");
        int priceProduct = Integer.parseInt(input.nextLine());
        products.get(idProduct).setName(nameProduct);
        products.get(idProduct).setPrice(priceProduct);
        displayProduct();
    }

    public static void deleteProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id you want to delete of product:");
        int idProduct = Integer.parseInt(input.nextLine());
        products.remove(idProduct);
        displayProduct();
    }
    public static void searchProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of product:");
        String nameProduct = input.nextLine();
        int index=0;
        for (int i=0;i< products.size();i++){
            if(products.get(i).getName()==nameProduct){
                index=i;
                System.out.println("product after search is:"+products.get(index));
            }else {
                System.out.println("Not found");
            }
        }

    }
    public static void sortUpByPrice(){
        SortByPrice sortByPrice=new SortByPrice();
        Collections.sort(products,sortByPrice);
        displayProduct();
    }
    public static void sortDownByPrice() {
        Collections.sort(products);
        displayProduct();
    }


}
