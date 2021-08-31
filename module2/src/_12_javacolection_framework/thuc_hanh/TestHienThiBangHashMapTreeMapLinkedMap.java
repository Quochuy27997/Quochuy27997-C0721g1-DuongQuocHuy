package _12_javacolection_framework.thuc_hanh;

import javafx.fxml.FXMLLoader;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHienThiBangHashMapTreeMapLinkedMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("huy", 24);
        hashMap.put("tan", 24);
        hashMap.put("nhat", 24);
        hashMap.put("sang", 24);
        System.out.println("hiển thị danh sách lưu bằng hashmap");
        System.out.println(hashMap+"\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("huy", 30);
        treeMap.put("tan", 31);
        treeMap.put("nhat", 29);
        treeMap.put("sang", 29);
        System.out.println("hiển thị danh sách lưu bằng treemap");
        System.out.println(treeMap+"\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("huy", 30);
        linkedHashMap.put("tan", 31);
        linkedHashMap.put("nhat", 29);
        linkedHashMap.put("sang", 29);
        System.out.println("hiển thị danh sách lưu bằng linkedhashmap");
        System.out.println(linkedHashMap+"\n");
        System.out.println("\nThe age for " + "huy is " + linkedHashMap.get("huy"));


    }
}
