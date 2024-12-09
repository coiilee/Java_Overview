package com.kh.practiceEx.oopArrayPre;

import java.util.Arrays;
import java.util.Scanner;

public class PersonService {
    public static void main(String[] args) {
        
        //Person 배열 생성 
        Person[] people = new Person[4]; 

        /*
        //Person 배열의 각 값을 객체로 초기화 
        people[0] = new Person("홍길동",20);
        people[1] = new Person("박길자",30);
        people[2] = new Person("오성순",40);
        people[3] = new Person("강하석",50);
*/

        Scanner sc = new Scanner(System.in);

        //scanner 객체를 이용해 사용자에게 키보드로 정보를 입력하고, 배열 초기화
        //for문을 이용해서 00번째 사람의 이름을 입력하세요
        //00번째 사람의 나이를 입력하세요
        for (int i = 0; i < people.length; i++) {
            System.out.println(i +"번째 사람의 이름을 입력하세요.");
            String name = sc.nextLine();

            System.out.println(i+"번째 사람의 나이를 입력하세요 : ");
            int age = sc.nextInt();
            sc.nextLine(); //int 남아있는 줄바꿈 버퍼 비우기
            //이름 입력한 내용이 Person 00번째 객체 생성 및 배열에 저장
            people[i] = new Person(name, age);

        }

        //저장 완료할 경우 for문을 탈출해서 모든사람이 등록되었습니다 출력문 결과 출력
        System.out.println("모든 사람이 등록되었습니다. 아래는 등록된 정보입니다.");





        //각 배열의 값을 출력 1. 일반for문  2. 향상된 for문으로 만들기

        //1번 일반 for문
        System.out.println("일반 for문 출력결과 : " + Arrays.toString(people));
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        //2번 향상된 for문 (for-each문)
        System.out.println("향상된 for문으로 출력 : ");

        for ( Person p : people) {
            System.out.println(p);
        }
    }
}
