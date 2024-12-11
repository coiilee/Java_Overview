package com.kh.testEx.test2;
//for 문으로 snack 리스트 출력 결과 :
// Snack{name= '포테이토칩' , flavor = '짠맛' , price= 1500 }
// Snack{name= '초코파이' , flavor = '단맛' , price= 2000 }
// Snack{name= '허니버터칩' , flavor = '허니버터맛' , price= 2500 }

import java.util.ArrayList;

public class SnackRun {

public static void main(String[] args) {
    Snack snack1 = new Snack("포테이토칩","짠맛",1500);
    Snack snack2 = new Snack("초코파이","단맛",1500);
    Snack snack3 = new Snack("허니버터칩","짠맛",1500); //여기에 추가할 과자 정보 집어넣고
 //오답 :    ArrayList<String> snacklist = new ArrayList<String>();
    ArrayList<Snack> snacklist = new ArrayList<Snack>();
    snacklist.add(snack1);
    snacklist.add(snack2);
    snacklist.add(snack3); //arraylist안에는 변수만 넣어 출력하기

for (Snack snack : snacklist) {
    System.out.println(snack);
}


}
}
