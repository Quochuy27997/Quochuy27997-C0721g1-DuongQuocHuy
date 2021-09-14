package _case_study.utils;

import _case_study.models.*;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> ReadCSVToString(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Employee> getListEmployee(String path){
        List<String> stringList = ReadCSVToString("src/_case_study/models/Employee.java");
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Employee employee = new Employee(array[0], array[1], array[2],
                    array[3], array[4],array[5],array[6],array[7], array[8],array[9], Integer.parseInt(array[10]));
            employeeList.add(employee);
        }
        return employeeList;
    }
    public static List<Customer> getListCustomer(String path) {
        List<String> stringList = ReadCSVToString(path);
        List<Customer> customersList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Customer customer = new Customer(array[0], array[1], array[2],
                    array[3], array[4],array[5],array[6],array[7],array[8]);
            customersList.add(customer);
        }
        return customersList;
    }
    public static List<House> getListHouse(String path){
        List<String> stringList = ReadCSVToString(path);
        List<House> houseList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            House house = new House(array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]),
                    Integer.parseInt(array[3]), array[4],array[5],Integer.parseInt(array[6]));
            houseList.add(house);
        }
        return houseList;
    }
    public static List<Villa> getListVilla(String path){
        List<String> stringList = ReadCSVToString(path);
        List<Villa> villaList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Villa villa = new Villa(array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]),
                    Integer.parseInt(array[3]), array[4],array[5],Double.parseDouble(array[6]),Integer.parseInt(array[7]));
            villaList.add(villa);
        }
        return villaList;
    }
    public static List<Room> getListRoom(String path){
        List<String> stringList = ReadCSVToString(path);
        List<Room> roomList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] array = stringList.get(i).split(",");
            Room room = new Room(array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]),
                    Integer.parseInt(array[3]), array[4],array[5]);
            roomList.add(room);
        }
        return roomList;
    }

}
