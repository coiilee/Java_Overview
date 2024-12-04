package com.kh.practice;

import java.util.Map;

public interface TodoService {
    /**
     * @return =  todoList + 완료개수
     */
    Map<String,String> todoListFullView();

    /** 할일 목록을 반환하는 서비스
     * @param title 할 일의 제목
     * @param detail 할 일의 상세내용
     * @return        추가된 할 일의 번호를 전달/ 전달 실패 시 -1 뜸
     */

   int todoAdd(String title, String detail);

    /** 할일 목록을 반환하는 서비스
     * @param index =수정할 할일의 번호
     * @param title =수정할 할 일의 제목
     * @param detail = 수정할 할일의 상세내용
     * @return        할 일 수정 성공 실패 유무를 true / false 전달
     */
   boolean todoUpdate(int index, String title , String detail);
}
