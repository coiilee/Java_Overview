package com.kh.testEx.test3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSet {
    //학생들의 이름을 관리하는 프로그램 작성
    //학생의 이름을 set을 사용하여 중복 없이 관리하고, 다음의 요구사항을 충족하도록 하기
 /*   사용코드
System.out.println("학생 관리 프로그램");
System.out.println("1. 학생 추가");
System.out.println("2. 학생 삭제");
System.out.println("3. 학생 목록 출력");
System.out.println("4. 특정 학생 존재 여부 확인");
System.out.println("5. 종료");
System.out.print("메뉴 선택: "); */

    //학생추가 :
    //    학생이름을 set에 추가
    //    이름이 이미 존재하는 경우는 추가 x

    //학생삭제 :
    //학생 이름을 입력받아 set에서 삭제
    //존재하지 않는 이름을 삭제하려고 하면 "존재하지 않는 학생입니다" 라는 메세지 출력
    //학생목록 출력 :
    //현재 set에 저장된 학생들의 이름 출력

    //특정 학생 존재 여부 확인 :
    //특정 학생이름을 입력받아 set에 존재하는지 확인하고, 존재 여부에 따라 메시지를 출력한다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 관리 프로그램");
        System.out.println("1. 학생 추가");
        System.out.println("2. 학생 삭제");
        System.out.println("3. 학생 목록 출력");
        System.out.println("4. 특정 학생 존재 여부 확인");
        System.out.println("5. 종료");
        System.out.print("메뉴 선택: ");
        sc.nextInt();
//        while (!=exit){
            Set<String> set = new HashSet<String>();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                //학생  추가
                case 1:
                    System.out.println("===[1] 학생 추가 ===");
                    System.out.println("추가할 학생 이름 입력 : ");
                    String addname = sc.nextLine();
                    if (set.add(addname)) {
                        System.out.println(addname + "이 추가되었습니다.");
                    } else { //이게왜 존재안하는거즤 ..
                        System.out.println(addname + "은 이미 존재하는 학생입니다.");
                    }
                    break;

                //학생 삭제
                case 2:
                    System.out.println("======[2]학생 삭제======");
                    System.out.println("삭제할 학생의 이름을 입력하세요");
                    String removeName = sc.nextLine();
                    if (set.remove(removeName)) {
                        System.out.println(removeName + "이(가) 삭제되었습니다.");
                    } else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    break;

                case 3:
                    System.out.println("=====현재 학생 목록======");
                    if (set.isEmpty()) {
                        System.out.println("학생 목록이 비어있습니다.");
                    } else {
                        for (String name : set) {
                            System.out.println(name);
                        }
                    }
                    break;

                case 4:
                    System.out.println("====[4]특정 학생 조회 ===");
                    System.out.print("존재여부를 확인할 학생 이름 입력 : ");
                    String nameCheck = sc.nextLine();
                    if (set.contains(nameCheck)) {
                        System.out.println(nameCheck + "은 존재하는 학생힙니다.");
                    } else {

                    }
                    break;
                case 5:
                    System.out.println("프로그램 종료");
//                    exit = true;
                    break;
                default:
                    break;


            }


        }
    }
//}
