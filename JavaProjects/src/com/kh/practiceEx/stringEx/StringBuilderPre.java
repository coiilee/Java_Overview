package com.kh.practiceEx.stringEx;

public class StringBuilderPre {

    /* todo String str = "Welcome";

    1.작성된 객체를 StringBuilder sb로 변환해서 사용
    2.to Java 이어서 작성
    3.8번째 자리에 the world of 글자 추가하기
    4.4~11 come to로 변경
    5.20,25 삭제
    6.sb 뒤집기

     */
    public static void main(String[] args) {

        StringBuilder sb =  new StringBuilder("Welcome");
        sb.append("to Java");
        System.out.println("1. to java 이어서 작성 : " + sb);

        sb.insert(8,"the world of");
        System.out.println("2. 8번째 자리에 the world of 추가 : " +sb);

        sb.replace(4,11,"come to");
        System.out.println("3. 4~11 come to로 변경 : " +sb);

        sb.delete(20,25);
        System.out.println("4. 20,25 삭제"+ sb);

        sb.reverse();
        System.out.println("5. sb 뒤집기 : "+sb);

    }
}
