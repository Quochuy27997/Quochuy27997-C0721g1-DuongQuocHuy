package _case_study.utils;

import _case_study.models.*;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.*;
import java.util.*;

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
        List<String> stringList = ReadCSVToString(path);
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
    public static Map<House,Integer> getListHouse(String path){
        List<String> stringList = ReadCSVToString(path);
        Map<House,Integer> houseIntegerMap = new LinkedHashMap<>();
        for (String s:stringList) {
            String[] array = s.split(",");
            House house = new House(array[0],array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                    Integer.parseInt(array[4]), array[5],array[6],Integer.parseInt(array[7]));
            houseIntegerMap.put(house,Integer.parseInt(array[8]));
        }
        return houseIntegerMap;
    }
    public static Map<Villa,Integer> getListVilla(String path){
        List<String> stringList = ReadCSVToString(path);
        Map<Villa,Integer> villaIntegerMap = new LinkedHashMap<>();
        for (String s:stringList) {
            String[] array = s.split(",");
            Villa villa = new Villa(array[0],array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                    Integer.parseInt(array[4]), array[5],array[6],Double.parseDouble(array[7]),Integer.parseInt(array[8]));
            villaIntegerMap.put(villa,Integer.parseInt(array[9]));
        }
        return villaIntegerMap;
    }
    public static Map<Room,Integer> getListRoom(String path){
        List<String> stringList = ReadCSVToString(path);
        Map<Room,Integer> roomIntegerMap = new LinkedHashMap<>();
        for (String s:stringList) {
            String[] array = s.split(",");
            Room room = new Room(array[0],array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                    Integer.parseInt(array[4]), array[5],array[6]);
            roomIntegerMap.put(room,Integer.parseInt(array[7]));
        }
        return roomIntegerMap;
    }


}
