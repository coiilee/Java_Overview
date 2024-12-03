package com.kh.practice.todolist;

import java.io.*;

public class 문제5번 {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.home")+"/Desktop/");
        try {
            file.createNewFile();
            if(file.exists()){
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while((line = bufferedReader.readLine()) != null){
                    System.out.println("내용 출력 : " + line);
                    System.out.println(line.)

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
