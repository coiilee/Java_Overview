package com.kh.testEx.test3;

import java.util.HashMap;
import java.util.Map;

/*
다음은 특정 학생들의 이름과 점수를 관리하고 출력하는 프로그램입니다.
Map을 활용하여 학생 정보를 저장하고, 조건에 맞게 처리하는 프로그램을 작성하시오.
조건 :
학생 정보 저장
학생 이름을 키(Key), 점수를 값(value)으로 저장한다.
기본 데이터는 아래와 같다:(모두 줄바꿈 형태)
"김철수": 85 이영희": 92 박민수": 77 최수진": 88
학생 정보 출력
저장된 모든 학생 이름과 점수를 출력한다.(모두 줄바꿈 형태)

김철수: 85점 이영희: 92점
점수 기준으로 합격/불합격 판단
합격 기준은 89점 이상이다.
합격/불합격 여부를 학생 이름과 함께 출력한다.
형식 예시: (모두 줄바꿈 형태)
김철수: 합격 이영희: 합격 박민수: 불합격
점수 수정 기능
특정 학생의 점수를 수정할 수 있는 코드를 작성하시오.
예를 들어, 박민수의 점수를 77점에서 82점으로 수정하고, 다시 합격/불합격 여부를 출력한다.
예외처리
존재하지 않는 학생의 점수를 수정하려고 하면 존재하지 않는 학생입니다. 라는 메시지를 출력한다.
**/
class StudentScoreManager {
    public static void main(String[] args) {
Map<String,Integer> score = new HashMap<String,Integer>();
StudentScoreManager ssm = new StudentScoreManager();
        score.put("\n김철수 ",85);
        score.put("\n이영희", 92);
        score.put("\n박민수", 77);
        score.put("\n최수진", 88);
        System.out.println("모든 학생의 이름과 점수 : " +score);

// 모든 학생의 정보 출력
        System.out.println("학생 정보 출력");
        for (Map.Entry<String,Integer> entry : score.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()+"점");
        }
// 합격/불합격 판단 if문 사용
System.out.println("합격, 불합격 판단");
        for (Map.Entry<String,Integer> entry : score.entrySet()) {
            if (entry.getValue() >= 89) {
                System.out.println(entry.getKey() + "는"+entry.getValue()+"점으로 합격입니다." );
            } else {
                System.out.println (entry.getKey()+"는 불합격입니다.");
            }
        }
        //강사님 코드
        for (Map.Entry<String,Integer> entry : score.entrySet()) {
            String status = (entry.getValue()>=89) ? "합격" : "불합격";
            System.out.println(entry.getKey()+ ":"+status);
        }
//점수 수정 코드

        String updateName = "박민수";
        if(score.containsKey(updateName)){
            score.put(updateName, 82);
            System.out.println(updateName+"의 점수를 82점으로 수정합니다. ");
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }

        System.out.println("점수 수정 후 합격/불합격 판단");
        for(Map.Entry<String,Integer> entry:score.entrySet()){
            String status = (entry.getValue()>=89)? "합격" : "불합격";
            System.out.println(entry.getKey()+":"+status);
        }

        /**
         *
         */
        //점수 출력 기능 메서드
        public void printPassFailScore(Map<String,Integer> score){
            for(Map.Entry<String,Integer> entry:score.entrySet()){
                String status = (entry.getValue()>=89)? "합격" : "불합격";
                System.out.println(entry.getKey()+":"+status);
            }
        }








    }

        }







