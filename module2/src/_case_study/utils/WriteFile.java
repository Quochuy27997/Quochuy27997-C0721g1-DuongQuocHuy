package _case_study.utils;

import _case_study.models.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    public static void writeVillaToCSV(Map<Villa,Integer> villaIntegerMap, String path, boolean append){
        List<String> stringList=new ArrayList<>();
       Set<Villa> set= villaIntegerMap.keySet();
       for (Villa villaKey:set){
           stringList.add(villaKey.getString()+","+villaIntegerMap.get(villaKey));
       }
        WriteCSV(stringList,path,append);
    }
    public static void writeRoomToCSV(Map<Room,Integer> roomIntegerMap, String path, boolean append){
        List<String> stringList=new ArrayList<>();
        Set<Room> set= roomIntegerMap.keySet();
        for (Room roomKey:set){
            stringList.add(roomKey.getString()+","+roomIntegerMap.get(roomKey));
        }
        WriteCSV(stringList,path,append);
    }
    public static void writeHouseToCSV(Map<House,Integer> houseIntegerMap, String path, boolean append){
        List<String> stringList=new ArrayList<>();
        Set<House> set= houseIntegerMap.keySet();
        for (House houseKey:set){
            stringList.add(houseKey.getString()+","+houseIntegerMap.get(houseKey));
        }
        WriteCSV(stringList,path,append);
    }
}
