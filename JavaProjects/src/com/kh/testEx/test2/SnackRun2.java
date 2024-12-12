package com.kh.testEx.test2;
//for 문으로 snack 리스트 출력 결과 :
// Snack{name= '포테이토칩' , flavor = '짠맛' , price= 1500 }
// Snack{name= '초코파이' , flavor = '단맛' , price= 2000 }
// Snack{name= '허니버터칩' , flavor = '허니버터맛' , price= 2500 }

import java.util.ArrayList;

public class SnackRun2 {

    public static void main(String[] args) {
Snack snack1 = new Snack("포테토칩","짠맛",1500);
Snack snack2 = new Snack("짱구","단맛",1500);
Snack snack3 = new Snack("뺴뺴로","짠맛",1500);

ArrayList<Snack> snacklist = new ArrayList<>();
snacklist.add(snack1);
snacklist.add(snack2);
snacklist.add(snack3);

for (Snack snack : snacklist) {
    System.out.println(snack);
}

    }


}
