package com.kh.practice;

public class TotalServiceRun {
    public static void main(String[] args) {
        TotalService totalService = new TotalService();
        //1번
        System.out.println("홀수 더하기 기능 ");
        totalService.oddSum();
        //2번
        System.out.println("첫번째 글자 A로 시작하는 단어 찾기 ");
        totalService.filterNames();
        //3번
        System.out.println("나눗셈 결과 출력  ");
        totalService.division();
        //5번
        System.out.println("파일안에 있는 숫자 더하고, 더한 숫자 result.txt.저장하기 ");
        totalService.fileSum();
        //7번
        System.out.println("계산기 실행하기  ");
        totalService.arithmeticOperations();

    }
}
