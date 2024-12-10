package com.kh.practiceEx.filePre;

import java.io.File;

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
        String path = System.getProperty("user.home"+"/desktop");
        String fileName = "food.docs";

        File file = new File(path, fileName); //파일경로, 파일명 가져오기

        try(){

        }catch(Exception e){

        }
    }
}
