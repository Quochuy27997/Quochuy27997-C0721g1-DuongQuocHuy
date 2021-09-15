package _case_study.controllers;

import _case_study.models.Employee;
import _case_study.services.CustomerService;
import _case_study.services.EmployeeService;
import _case_study.services.impl.CustomerServiceImpl;
import _case_study.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static EmployeeService employeeService=new EmployeeServiceImpl();
    static CustomerService customerService=new CustomerServiceImpl();
    final static String PATH_EMPLOYEE="src//_case_study//data//employee.csv";
    final static String PATH_CUSTOMER="src//_case_study//data//customer.csv";
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {

        Scanner input = new Scanner(System.in);
        int choice = -1;
        boolean check = true;
        while (choice != 6) {
            System.out.println("Menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    while (choice != 4) {
                        System.out.println("Menu Employee Management");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        System.out.println("Enter your choice:");
                        choice = Integer.parseInt(input.nextLine());
                        switch (choice) {
                            case 1:
                                employeeService.display(PATH_EMPLOYEE);
                                break;
                            case 2:
                              employeeService.add(PATH_EMPLOYEE);
                                break;
                            case 3:
                            employeeService.edit(PATH_EMPLOYEE);
                                break;
                            case 4:
                                System.exit(0);

                        }
                    }
                    break;
                case 2:
                    while (choice != 4) {
                        System.out.println("Menu Customer Management");
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customers");
                        System.out.println("3. Edit customers");
                        System.out.println("4. Return main menu");
                        System.out.println("Enter your choice:");
                        choice = Integer.parseInt(input.nextLine());
                        switch (choice) {
                            case 1:
                               customerService.display(PATH_CUSTOMER);
                                break;
                            case 2:
                                customerService.add(PATH_CUSTOMER);
                                break;
                            case 3:
                                customerService.edit(PATH_CUSTOMER);
                                break;
                            case 4:
                                System.exit(0);
                        }
                    }
                    break;
                case 3:
                    while (choice != 4) {
                        System.out.println("Menu Facility Management ");
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        System.out.println("Enter your choice:");
                        choice = Integer.parseInt(input.nextLine());
                        switch (choice) {
                            case 1:
//                                .display(); phuong thuc hien
                                break;
                            case 2:
//                                .add(); phuong thuc them
                                break;
                            case 3:
//                                .edit(); phuong thuc sua
                                break;

                        }
                    }
                    break;
                case 4:
                    while (choice != 6) {
                        System.out.println("Menu Booking Managerment  ");
                        System.out.println("1. Add new Booking");
                        System.out.println("2. Display list Booking");
                        System.out.println("3. Create new constracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        System.out.println("Enter your choice:");
                        choice = Integer.parseInt(input.nextLine());
                        switch (choice) {
                            case 1:
//                                .display(); phuong thuc hien
                                break;
                            case 2:
//                                .add(); phuong thuc them
                                break;
                            case 3:
//                                .edit(); phuong thuc sua
                                break;

                        }
                    }
                    break;
                case 5:
                    while (choice != 2) {
                        System.out.println("Menu Promotion Management  ");
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");

                        System.out.println("Enter your choice:");
                        choice = Integer.parseInt(input.nextLine());
                        switch (choice) {
                            case 1:
//                                .display(); phuong thuc hien
                                break;
                            case 2:
//                                .add(); phuong thuc them
                                break;
                            case 3:
//                                .edit(); phuong thuc sua
                                break;

                        }
                    }
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Error!!!");
            }
        }
    }
}
