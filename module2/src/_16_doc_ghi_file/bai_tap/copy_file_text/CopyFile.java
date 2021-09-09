package _16_doc_ghi_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    static class ReadAndWriteFile{
        public String readFile(String filePath){
            String string="";
            try{
                File file = new File(filePath);
                if(!file.exists()){
                    throw new FileNotFoundException();
                }
                BufferedReader bufferedReader =new BufferedReader(new FileReader(file));
                String line ="";//doc tung dong
                while((line=bufferedReader.readLine())!=null){
                   string+=line;
                }
                bufferedReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return string;
        }
        public void writeFile(String filePath, String writeString){
            try{
                FileWriter writer = new FileWriter(filePath,true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write(writeString);
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter path of file:");
        String readFilePath = input.nextLine();
        System.out.println("Enter path of file you want to copy to :");
        String writeFilePath = input.nextLine();
        ReadAndWriteFile readAndWriteFile =new ReadAndWriteFile();
        readAndWriteFile.writeFile(writeFilePath,readAndWriteFile.readFile(readFilePath));

    }
}
