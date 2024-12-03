package com.kh.practice.todolist;

import java.util.Scanner;

public class 문제3번 {

            Scanner sc = new Scanner(System.in);

            public void calculate() {
                System.out.println("첫번째 정수를 입력하세요 ");
                int a = sc.nextInt();
                System.out.println("두번째 정수를 입력하세요 ");
                int b = sc.nextInt();

                try {
                    int result = a / b;
                    System.out.println("값 : " + result);
                } catch (Exception e) {
                   System.out.println(e.getMessage()+"Cannot divide by 0");
                }
            }
        }
