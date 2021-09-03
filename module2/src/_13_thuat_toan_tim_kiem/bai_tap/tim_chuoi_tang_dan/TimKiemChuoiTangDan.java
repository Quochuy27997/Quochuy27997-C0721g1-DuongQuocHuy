package _13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan;

import java.util.LinkedList;
import java.util.Scanner;

public class TimKiemChuoiTangDan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhap chuoi:");
        String string= input.nextLine();
        LinkedList<Character> maxString=new LinkedList<>();
        LinkedList<Character> tempString=new LinkedList<>();
        for (int i=0;i<string.length();i++){
            tempString.add(string.charAt(i));
            for (int j=i+1;j<string.length();j++){
                if(string.charAt(j)>tempString.getLast()){
                    tempString.add(string.charAt(j));
                }
            }
            if(tempString.size()>maxString.size()){
                maxString.clear();
                maxString.addAll(tempString);
            }
            tempString.clear();
        }
        for(Character character:maxString){
            System.out.println(character);
        }
    }
}
