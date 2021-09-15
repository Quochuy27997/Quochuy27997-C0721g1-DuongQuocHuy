package _case_study.services.impl;

import _case_study.models.Customer;

import _case_study.models.Employee;
import _case_study.services.CustomerService;
import _case_study.utils.ReadFile;
import _case_study.utils.WriteFile;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display(String path) {
        List<Customer> customerList = ReadFile.getListCustomer(path);
        System.out.println("list Customer");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(i + 1 + "." + customerList.get(i));
        }
    }

    @Override
    public void add(String path) {
        List<Customer> customerList = ReadFile.getListCustomer(path);
        String customerCode = "";
        boolean flag = true;
        while (flag) {
            System.out.println("enter new customer code");
            customerCode = scanner.nextLine();
            flag = false;
            for (Customer customer : customerList) {
                if (customer.getCustomerCode().equals(customerCode)) {
                    System.out.println("customer code is exist,enter again!");
                    flag = true;
                    break;
                }
            }
        }

        System.out.println("Enter name of customer");
        String name = scanner.nextLine();
        System.out.println("Enter dateOfBirth of customer");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter gender of customer");
        String gender = scanner.nextLine();
        System.out.println("Enter idCard of customer");
        String idCard = scanner.nextLine();
        System.out.println("Enter phoneNumber of customer");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email of customer");
        String email = scanner.nextLine();
        System.out.println("Enter address of customer");
        String address = scanner.nextLine();
        System.out.println("Enter Type of customer");
        String customerType = scanner.nextLine();
        customerList.add(new Customer(name, dateOfBirth, gender, idCard, phoneNumber,
                email, address, customerCode, customerType));
        WriteFile.writeCustomerToCSV(customerList, path, false);
        display(path);
    }


    @Override
    public void edit(String path) {

        List<Customer> customerList = ReadFile.getListCustomer(path);
        display(path);
        String codeOfCustomer;
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Enter code of customer you want to edit:");
            codeOfCustomer = scanner.nextLine();
            flag = false;
            for (Customer customer : customerList) {
                if (customer.getCustomerCode().equals(codeOfCustomer)) {
                    System.out.println("Menu Edit"

                            + "1.Edit name of customer\n"
                            + "2.Edit dateOfBirth of customer\n"
                            + "3.Edit gender of customer\n"
                            + "4.Edit idCard of customer\n"
                            + "5.Edit phoneNumber of customer\n"
                            + "6.Edit email of customer\n"
                            + "7.Edit address of customer\n"
                            + "8.Edit Code of customer\n"
                            + "9.Edit Type of customer\n"
                           + "0.Exit \n"
                    );
                    System.out.println("enter your choose:");
                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {
                        case 1:
                            System.out.println("Enter new name of employee:");
                            String name = scanner.nextLine();
                            customer.setName(name);
                            break;
                        case 2:
                            System.out.println("Enter new dateOfBirth of employee:");
                            String dateOfBirth = scanner.nextLine();
                            customer.setDateOfBirth(dateOfBirth);
                            break;
                        case 3:
                            System.out.println("Enter new gender of employee:");
                            String gender = scanner.nextLine();
                            customer.setGender(gender);
                            break;
                        case 4:
                            System.out.println("Enter new idCard of employee:");
                            String idCard = scanner.nextLine();
                            customer.setIdCard(idCard);
                            break;
                        case 5:
                            System.out.println("Enter new phoneNumber of employee:");
                            String phoneNumber = scanner.nextLine();
                            customer.setPhoneNumber(phoneNumber);
                            break;
                        case 6:
                            System.out.println("Enter new email of employee:");
                            String email = scanner.nextLine();
                            customer.setEmail(email);
                            break;
                        case 7:
                            System.out.println("Enter new address of employee:");
                            String address = scanner.nextLine();
                            customer.setAddress(address);
                            break;
                        case 8:
                            System.out.println("Enter new code of employee:");
                            String code = scanner.nextLine();
                            customer.setCustomerCode(code);
                            break;
                        case 9:
                            System.out.println("Enter new level of employee:");
                            String Type = scanner.nextLine();
                            customer.setCustomerType(Type);
                            break;

                        default:
                            break;

                    }
                }
                if (check) {
                    System.out.println("customer name does not exist, please re-enter another name !");
                    flag = true;
                }
                WriteFile.writeCustomerToCSV(customerList, path, false);
                display(path);
            }
        }
    }


}



