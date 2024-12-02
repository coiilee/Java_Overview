package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionifExRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ConditionIfEx cix = new ConditionIfEx();
//        System.out.println("나이를 숫자로 입력하세요");
//        int age = sc.nextInt();
//        sc.nextLine();
//        cix.method0();
//    cix.method1();
//    cix.method2();
//    cix.method3();
//    cix.method4();
//
//        ConditionPre cp = new ConditionPre();
//        System.out.print("계절을 숫자로 입력하세요.");
//        int month = sc.nextInt();
//        sc.nextLine(); // 줄바꿈 버퍼 제거
//        cp.method1(month);

        ConditionSwitchPre csp = new ConditionSwitchPre();
        System.out.print("슷자를 입력하세요");
        int choice = sc.nextInt();
        sc.nextLine();
        csp.choiceDay(choice);
    }
}
