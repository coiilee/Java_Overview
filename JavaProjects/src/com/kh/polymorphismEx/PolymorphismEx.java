package com.kh.polymorphismEx;
/*
* 다형성 : 다양한 형태를 지니는 성질
*
* 1. 상속 관계의 자식 객체의 모습이 여러 모습으로 보임
*    자식 객체, 부모 객체, Object 객체 등으로 변하는 것처럼 보임
*
* 2. 오버 로딩
*    같은 클래스에서 같은 이름의 메서드를 여러번 작성하는 기술
*    조건 : 메서드명 동일 , 매개변수 개수 , 타입 순서 하나라도 달라야함
*    목적 : 전달 받은 매개 변수에 따른 상황별 처리 방법 구현
* sum(a,b) -> 두 수 더하기
* sum(a,b,c) -> 세 수 더하기
* sum(배열) -> 배열 내 요소 모두 더하기
*
* */
//public class PolymorphismEx {

    /*
    //오버로딩 문제
    //public void sum 명칭 변경 x
    //하나는 두 수끼리 더하기
    //하나는 세 수끼리 더하기
    //하나는 두 실수끼리 더하기
    //하나는 두 문자형기리 더하기
    public void sum(int a, int b) {
        System.out.println(a + b);
    };
    public void sum(int a, int b, int c) {
       System.out.println(a + b + c);
    };
    public void sum(float a, float b) {
      System.out.println(a + b);
    };
    public void sum(String a, String b) {
        System.out.println(a + b);
    };
*/

    //1-7까지 메소드 차례로 써나간다면 , 오버로딩이 적용되는 것은 무엇인가 ?
    //기준 : public void method1(int i){}
    // 메서드명 동일 , 매개변수 개수 , 타입 순서 하나라도 달라야함
//    //기준 public void method1(int i){}
//public void method1(String str){} ///적용됨 : 기준과 타입 다름
//public void method1(int i, String str){} ///적용됨 : 매개변수 개수,타입이 다름
//public void method1(int num){}      ///적용안됨 : 기준과 같은 형식
//public char method1(int point){}        /// 적용안됨 : 기준과 같은 형식
//public void method1(int i, int k){}  /// 적용됨 : 매개변수 개수 다름, 형식 다름
//public void method1(int num, String string){}   ///적용안됨 : 위에 같은 형식 존재
//public void method1(String str, int i){}    /// 적용됨 : 같은 형식 없음, 자료형 작성 순서가 달라서 가능
//
//}
