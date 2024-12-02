package com.kh.conditionEx;

public class ConditionSwitchPre {

    /*
    * 사용자가 입력한 숫자에 따라 해당 숫자가 어떤 요일인지 출력하는 프로그램
    * 1부터 7까지 숫자를 입력받아 switch문 사용해 요일 출력
    *
    * 1: 월요일
    * 2 : 화
    * 3 : 수
    * 4: 목
    * 5 : 금
    * 6 :토:
    * */

    public void choiceDay(int choice) {
        String result = "";
        switch (choice) {
            case 1:
                result = "월요일";
                break;
                case 2:
                    result ="화요일";
                    break;
                    case 3:
                        result = "수요일";
                        break;
                        case 4:
                            result = "목요일";
                            break;
                            case 5:
                                result = "금요일";
                                break;
                                case 6:
                                    result = "토요일";
                                    break;
                                    case 7:
                                        result = "일요일";
                                        break;
                                        default:
                                            break;

        }
        System.out.println(choice + "일자는"+ result + "요일 입니다.");

    }
}
