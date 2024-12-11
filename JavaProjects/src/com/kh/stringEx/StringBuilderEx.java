package com.kh.stringEx;

public class StringBuilderEx {

    /*
    StringBuilder 기능들
    append(String str)                           = 문자열을 현재 문자열 끝에 추가
    insert(int index,String str)                 = 지정한 위치에 문자열 삽입
    delete(int start , int end)                  = 지정된 범위의 문자열 삭제
    deleteCharAt(int index)                      = 지정한 index 의 문자 하나를 삭제
    replace(int start, int end, String str)      = 지정한 범위의 문자열을 다른 문자열로 대체
    reverse()                                    = 문자열을 뒤집음(거꾸로)
    length()                                     = 문자열의 길이를 반환
    charAt(int index)                            = 지정한 위치의 문자를 반환
    setCharAt(int index,char ch)                 = 지정한 위치의 문자를 다른 문자 하나로 변경
    subString(int start, int end)                = 지정된 범위의 문자열 반환
    subString(int start)                         = 지정된 위치부터 끝까지 반환
    trimToSize()                                 = 내부 버퍼 크기를 현재 문자열 길이에 맞춤
    capacity()                                   = 현재 내부 버퍼의 크기(용량) 반환
    ensureCapacity(int minimumSize)              = 내부 버퍼의 용량을 최소 지정 용량으로 늘리기
     */





    public static void main(String[] args) {
        StringBuilderEx sb = new StringBuilderEx();
//        sb.method1();
        sb.methodStringBuilder();
    }

    public void methodStringBuilder() {
        //String 객체를 StringBuilder에 넣어줌
        //sb1은 메모리에 sb1 공간은 생성되어 있지만 , 아무런 값도 들어있지 않은 상태

        StringBuilder sb1 = new StringBuilder();
        //sb2는 메모리에 sb2 공간을 생성하면서 Hello 라는 글자가 들어있는 상태
        StringBuilder sb2 = new StringBuilder("Hello");

        //sb2에 World 문자열을 추가
        sb2.append("World"); //String 이기 때문에 , 자료형도 String
        System.out.println("1. World 문자가 추가되었는지 확인 " + sb2);

        //insert를 이용해서 6번째 위치에 java 글자를 삽입
        //index 0부터 시작
        sb2.insert(5," JAVA ");
        System.out.println("2. JAVA추가 확인 : " +sb2);
        System.out.println(sb2.length());

        //replace를 이용해 6-10 범위를 Python으로 대체
        sb2.replace(6,10,"Phython");
        System.out.println("Java -> Python : " + sb2);

        //sb2 6~13 범위의 값 삭제 delete
        StringBuilder delete = sb2.delete(6,13);
        System.out.println("6~13 범위의 값 삭제 : "+delete);

        //reverse를  이용해서 sb2 문자열 뒤집기
        StringBuilder reverse = sb2.reverse();
        System.out.println("문자열 뒤집기 결과 : "+reverse);


    }

    public void method1(){
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello"); //s1공간에 hello가 작성되고
        s1.append("World"); //s1공간에 hello world가 작성됨
        System.out.println(s1);
        //String 에서는 +=을 작성하지 않으면 이어서 작성한 다음
        //객체 생성을 하지 않고 단독 작성

        //StringBuilder는 이어서 작성
    }
}
