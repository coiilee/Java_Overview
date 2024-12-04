package com.kh.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TotalService {
    public void Oddnum() {
        //1번
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : numbers) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("홀수 값의 합 : " + sum);
    }

    public void filterNames(){
        //2번
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Eve");
        /*
        * String 참조자료형에 들어있는 기능
        * 맨 앞 변수명은 boolean 으로 사용
        * startsWith (String prefix) = prefix 로 시작하는 글자가 있는지 확인
        *   예제) boolean startWord = String 으로 들어있는 변수명.startsWith("시작하는단어글자");
        * endWith(String suffix) = prefix 로 끝나는 글자가 있는지 확인
        *    예제) boolean endWord = String 으로 들어있는 변수명.endWith("시작하는단어글자");
         * prefix : 시작하는 접두사
        * suffix : 끝나는 접미사
        * 접두사 : 접할 접 머리두 언어사
        * 접미사 : 접할접 꼬리미 언어 사
        * */
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }
    }

    //3번 예외처리
        public void calculate() {
        Scanner sc = new Scanner(System.in);
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

        //5번
        public void fileSum() {

            String path = System.getProperty("user.home")+"/Desktop/";
            String readFile = "numbers.txt";


            FileReader file = null; //path + readFile 해줘야함
            try {
                file = new FileReader(path+readFile);
            BufferedReader br = new BufferedReader(file);
                    int sum = 0;
                    String line;
                    while((line= br.readLine())!=null){
                        sum += Integer.parseInt(line);
                    }
            } catch (Exception e) {
                System.out.println(e.getMessage()+"예상치 못한 문제로 파일을 읽을 수 없습니다.");
            }

            //위는 numbers.txt 내부 숫자 모두 더하는 기능
            //아래는 더해진 숫자 result.txt 작성 기능

            try {
                FileWriter fw = new FileWriter(path+"result.txt");
                {
//                        fw.write("sum : "+ sum);
                        System.out.println("더한 결과 작성 완료");
                    }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

            //7번
             public void arithmeticOperations(){
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

                System.out.println("합: " + (num1+num2));
                System.out.println("차 :  " + (num1-num2));
                System.out.println("곱: " + (num1*num2));
                 try {
                     System.out.println("몫: " + (num1/num2));
                 } catch (Exception e) {
                     System.out.println(e.getMessage()+"Cannot divide by 0");
                 }
                 System.out.println("나머지: " + (num1%num2));
            }

        }

























}







