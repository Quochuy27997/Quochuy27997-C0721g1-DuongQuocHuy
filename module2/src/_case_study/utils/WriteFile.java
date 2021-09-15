package _case_study.utils;

import _case_study.models.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static void WriteCSV(List<String> stringList,String path,boolean append){
        File file=new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (String line: stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeEmployeeToCSV(List<Employee> employeelist, String path, boolean append){
        List<String> stringList=new ArrayList<>();
        for (Employee employee:employeelist){
            stringList.add(employee.getString());
        }
        WriteCSV(stringList,path,append);
    }
    public static void writeCustomerToCSV(List<Customer> customerlist, String path, boolean append){
        List<String> stringList=new ArrayList<>();
        for (Customer customer:customerlist){
            stringList.add(customer.getString());
        }
        WriteCSV(stringList,path,append);
    }
    public static void writeVillaToCSV(List<Villa> villalist, String path, boolean append){
        List<String> stringList=new ArrayList<>();
        for (Villa villa:villalist){
            stringList.add(villa.toString());
        }
        WriteCSV(stringList,path,append);
    }
    public static void writeRoomToCSV(List<Room> roomlist, String path, boolean append){
        List<String> stringList=new ArrayList<>();
        for (Room room:roomlist){
            stringList.add(room.toString());
        }
        WriteCSV(stringList,path,append);
    }
    public static void writeHouseToCSV(List<House> houselist, String path, boolean append){
        List<String> stringList=new ArrayList<>();
        for (House house:houselist){
            stringList.add(house.toString());
        }
        WriteCSV(stringList,path,append);
    }
}
