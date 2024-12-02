package com.kh.loopEx;

import java.util.Scanner;

public class LoopRun {
    public static void main(String[] args) {
        ForEx forEx = new ForEx();
//        forEx.method1();
//        forEx.method2();
        WhileEx whileEx = new WhileEx();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        whileEx.method1();

    }
}
