package _case_study.services.impl;


import _case_study.models.Employee;
import _case_study.services.EmployeeService;
import _case_study.utils.ReadFile;
import _case_study.utils.WriteFile;


import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display(String path) {
        List<Employee> employeeList = ReadFile.getListEmployee(path);
        System.out.println("list Employee");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(i + 1 + "." + employeeList.get(i));
        }
    }

    @Override
    public void add(String path) {
        List<Employee> employeeList = ReadFile.getListEmployee(path);
        String employeeCode = "";
        boolean flag = true;
        while (flag) {
            System.out.println("enter new employee code");
            employeeCode = scanner.nextLine();
            flag = false;
            for (Employee employee : employeeList) {
                if (employee.getEmployeeCode().equals(employeeCode)) {
                    System.out.println("employee code is exist,enter again!");
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("Enter name of employee");
        String name = scanner.nextLine();
        System.out.println("Enter dateOfBirth of employee");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter gender of employee");
        String gender = scanner.nextLine();
        System.out.println("Enter idCard of employee");
        String idCard = scanner.nextLine();
        System.out.println("Enter phoneNumber of employee");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email of employee");
        String email = scanner.nextLine();
        System.out.println("Enter address of employee");
        String address = scanner.nextLine();
        System.out.println("Enter level of employee");
        String level = scanner.nextLine();
        System.out.println("Enter position of employee");
        String position = scanner.nextLine();
        System.out.println("Enter salary of employee");
        int salary = Integer.parseInt(scanner.nextLine());
        employeeList.add(new Employee(name, dateOfBirth, gender, idCard, phoneNumber,
                email, address, employeeCode, level, position, salary));
        WriteFile.writeEmployeeToCSV(employeeList, path, false);
        display(path);

    }

    @Override
    public void edit(String path) {
        List<Employee> employeeList = ReadFile.getListEmployee(path);
        display(path);
        String codeOfEmployee;
        boolean flag = true;
        boolean check = true;
        while (flag) {
            System.out.println("Enter code of employee you want to edit:");
            codeOfEmployee = scanner.nextLine();
            flag = false;
            for (Employee employee : employeeList) {
                if (employee.getEmployeeCode().equals(codeOfEmployee)) {
                    System.out.println("Menu Edit"

                            + "1.Edit name of Employee\n"
                            + "2.Edit dateOfBirth of Employee\n"
                            + "3.Edit gender of Employee\n"
                            + "4.Edit idCard of Employee\n"
                            + "5.Edit phoneNumber of Employee\n"
                            + "6.Edit email of Employee\n"
                            + "7.Edit address of Employee\n"
                            + "8.Edit code of Employee\n"
                            + "9.Edit level of Employee\n"
                            + "10.Edit position of Employee\n"
                            + "11.Edit salary of Employee\n"
                            + "0.Exit \n"
                    );
                    System.out.println("enter your choose:");
                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {
                        case 1:
                            System.out.println("Enter new name of employee:");
                            String name = scanner.nextLine();
                            employee.setName(name);
                            break;
                        case 2:
                            System.out.println("Enter new dateOfBirth of employee:");
                            String dateOfBirth = scanner.nextLine();
                            employee.setDateOfBirth(dateOfBirth);
                            break;
                        case 3:
                            System.out.println("Enter new gender of employee:");
                            String gender = scanner.nextLine();
                            employee.setGender(gender);
                            break;
                        case 4:
                            System.out.println("Enter new idCard of employee:");
                            String idCard = scanner.nextLine();
                            employee.setIdCard(idCard);
                            break;
                        case 5:
                            System.out.println("Enter new phoneNumber of employee:");
                            String phoneNumber = scanner.nextLine();
                            employee.setPhoneNumber(phoneNumber);
                            break;
                        case 6:
                            System.out.println("Enter new email of employee:");
                            String email = scanner.nextLine();
                            employee.setEmail(email);
                            break;
                        case 7:
                            System.out.println("Enter new address of employee:");
                            String address = scanner.nextLine();
                            employee.setAddress(address);
                            break;
                        case 8:
                            System.out.println("Enter new code of employee:");
                            String code = scanner.nextLine();
                            employee.setEmployeeCode(code);
                            break;
                        case 9:
                            System.out.println("Enter new level of employee:");
                            String level = scanner.nextLine();
                            employee.setLevel(level);
                            break;
                        case 10:
                            System.out.println("Enter new position of employee:");
                            String position = scanner.nextLine();
                            employee.setPosition(position);
                            break;
                        case 11:
                            System.out.println("Enter new salary of employee:");
                            int salary = Integer.parseInt(scanner.nextLine()) ;
                            employee.setSalary(salary);
                            break;
                        default:
                            break;

                    }
                }
                if (check) {
                    System.out.println("Employee name does not exist, please re-enter another name !");
                    flag = true;
                }
                WriteFile.writeEmployeeToCSV(employeeList, path, false);
                display(path);
            }
        }
    }
}
