package _12_javacolection_framework.bai_tap;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("0. Exit Menu");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. SortUp");
            System.out.println("7. SortDown");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    ProductManager.displayProduct();
                    break;
                case 2:
                    ProductManager.addProduct();
                    break;
                case 3:
                    ProductManager.editProduct();
                    break;
                case 4:
                    ProductManager.deleteProduct();
                    break;
                case 5:
                    ProductManager.searchProduct();
                    break;
                case 6:
                    ProductManager.sortUpByPrice();
                    break;
                case 7:
                    ProductManager.sortDownByPrice();
                    break;
                default:
                    System.out.println("please enter again !!!");
            }
        }
    }
}
