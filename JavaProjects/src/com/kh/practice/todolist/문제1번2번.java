package com.kh.practice.todolist;

import java.util.ArrayList;

public class
문제1번2번 {
    public static void main(String[] args) {
        //1번
        int numbers[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : numbers) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("홀수 값의 합 : " + sum);

        //2번
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Eve");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }
    }
}







