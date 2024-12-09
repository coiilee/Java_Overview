package com.kh.practiceEx.oopArrayPre;

public class Student {
    //필드 멤버변수 전역변수 인스턴스변수 속성
    private String name;
    private int age;
    private String idCard;

    //기본 생성자 : 객체를 처음 생성할 때 () 파라미터값을 하나도 넣지 않겠다는 생성자
    public Student() {
    }

    //필수생성자 : 파라미터 매개변수 생성자 ->  () 필수로 저장해야하는 변수명을 작성하는 생성자
    //만약 IDCARD가 필수가 아니라면 빼줄 수 있는 것
    public Student(String name, int age /*String idCard*/) {
        this.name = name;
        this.age = age;
        /*this.idCard = idCard;*/ // IDCARD 는 만들고 싶은 학생만 선택적으로 만들고 DB에 만든 아이디카드를 저장
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
