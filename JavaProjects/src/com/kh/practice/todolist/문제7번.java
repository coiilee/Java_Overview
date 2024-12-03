package com.kh.practice.todolist;

import java.util.Scanner;

public class 문제7번 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("합 : "+sum);
        int minus = num1 - num2;
        System.out.println("차 : "+minus);
        int multi = num1 * num2;
        System.out.println("곱 : "+multi);
        int div = (num1 / num2); // '/'는 나누기 연산자 진행시 나눈 값의 몫을 나타냄
        System.out.println("몫 : "+div);
        int mod = num1 % num2; // %는 나누기 연산자 진행시 나눈 값의 나머지 값을 나타냄
        System.out.println("나머지 : "+mod);




    }
}
