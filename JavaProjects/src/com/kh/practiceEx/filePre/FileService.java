package com.kh.practiceEx.filePre;

import java.io.*;

public class FileService {

    //File FileWriter 이용해서 바탕화면에 파일 만들기
    //food.docs 생성하기
    //try-catch

    /** 파일 생성 및 작성하기 메서드
     * void createFile(String content)
     * @param content
     */
    public void createFile(String content){
        //사용자 바탕화면 경로 가져오기
        String path = System.getProperty("user.home")+("/desktop");
        String fileName = "food.docs";

        File file = new File(path, fileName); //파일경로, 파일명 가져오기

        //try() 안에 FileWriter 나 FileReader BufferedReader를 작성하면 close 따로 작성 X
        try(FileWriter fw = new FileWriter(file)){
            fw.write(content);
            System.out.println("파일이 성공적으로 생성되고, 내용이 작성되었습니다.");
        }catch(Exception e){
            System.out.println("파일 생성 / 작성 중 오류 발생 : "+e.getMessage());
        }
    }

    //todo : file, filereader , bufferedreader 이용해서 파일 읽기 기능 설정

    public void readFile() {

        String path = System.getProperty("user.home"+"/desktop");
        String fileName = "food.docs";
        File file = new File(path, fileName);

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);{
                System.out.println("["+file+"] 내용 ");
                String line;
                while((line= br.readLine()) !=null){ //한줄씩 반복해서 다음줄이 빈값일 때까지 출력
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("문제가 발생했습니다." + e.getMessage());
        }


    }

    /**todo : 바탕화면에 있는 food.docs 파일에 이어쓰기 기능 설정 후 이어서 음식 작성
     *        줄바꿈 - 햄버거 줄바꿈 돈까스 줄바꿈 쌀국수 줄바꿈 카레
     *        File FileWriter
     *        FileServiceRun에서 readFile 한번더 불러와 이어서 잘 작성되었는지 확인하기
     *        제출
     *
     */
    /**파일 이어쓰기 기능 설정
     * void appendToFile(String content)
     * @param content
     */
    public void appendToFile(String content) {
        String path = System.getProperty("user.home")+"/desktop/";
        String fileName = "food.docs";
        File file = new File(path, fileName);

        if (file.exists()) {
            try {
                FileWriter fw = new FileWriter(file, true);
                fw.write(content);
                fw.close();
                System.out.println("이어 작성하기를 완료했습니다.");
            } catch (IOException e) {
                System.out.println("문제가 발생했습니다." + e.getMessage());
            } finally {

            }
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }

}






















