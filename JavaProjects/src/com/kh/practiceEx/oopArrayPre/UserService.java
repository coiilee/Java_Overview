package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public void setSaveAllUser(){
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.println("사용자를 등록합니다.");
        System.out.print("이름을 입력하세요.(2자 이상 5자 이하 작성 가능) : ");

        //setter를 이용해 user 저장하기

        //username 빈칸이거나 6글자 이상 저장 x return 시키기
        String inputName = sc.next();
        if(inputName != null && inputName.length() <6 && inputName.length() >=2 ) {
            u.setUsername(inputName);
            System.out.println(u.getUsername() + "저장되었습니다.");
        } else {
            System.out.println("이름은 빈칸이거나 6글자 이상 작성 x ");
            return;
        }

        //나이는 0세 초과 100세 미만으로 작성하고 초과면 나이는 1이상 100미만으로 작성 가능
        //return;
        //아무것도 입력 안됐을 때 생기는 예외처리. 빈칸으로 입력할 수 없습니다.
        try {
            System.out.println("나이를 입력하세요. (0~100 입력가능)");
            int inputAge = sc.nextInt();
            if (inputAge >0 && inputAge <100) {
                u.setAge(inputAge);
                System.out.println(u.getAge() + "저장되었습니다.");
            } else {
                System.out.println("나이는 1이상 100 미만으로 작성 가능합니다.");
                return;
            }
        } catch (Exception e) {
           System.out.println("나이는 숫자만 입력 가능합니다.");
        }


        // email 빈칸이거나 30자 이상 작성 불가 return 시키기
        System.out.println("이메일을 입력하세요 : ");
        String inputEmail = sc.nextLine(); ;
        if(inputEmail != null && inputEmail.length() >=30 ) {
            u.setEmail(inputEmail);
            System.out.println("[ "+u.getEmail()+"]메일 저장 완료");
        }else {
            System.out.println("email 빈칸이거나 30자 이상 작성 불가");
            return;
        }

        u.setUsername("홍길동"); //String 변수명 = u.setUsername 형식으로 변수명에 저장 불가
        u.setAge(10); // int 변수명 = u.setAge 형식으로 변수명에 저장 불가
        u.setEmail("hong@hong.com"); //String 변수명 = u.setEmail 형식으로 변수명에 저장 불가
        //set으로 저장된 값은 변수명에 넣어주는 것이 아니라 get 으로 정보 반환할 수 있음

        System.out.println("---------------- 저장된 사용자 정보 ----------------");
        //ArrayList 이용해서 정보 저장하고 출력하기
        ArrayList<User> arrayList = new ArrayList<>();

        if (u.getUsername().isEmpty() || u.getUsername().length() >= 6) {
            System.out.println("username은 빈칸이거나 6글자 이상이면 안됨");
            return;
        }
        else if (u.getEmail().isEmpty() || u.getEmail().length() > 30) {
            System.out.println("email 빈칸이거나 30자 이상 작성 불가");
            return;
        }

        arrayList.add(u);

        //toString으로 저장된 사용자 정보 가져오기
        for (User user : arrayList) {
            System.out.println(user.toString());
        }
    }


    //메서드 명칭 : void 기능 paramNameEmail
    public void paramNameEmail() {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.println("이름을 입력하세요 : ");
        String inputName = sc.next();
        sc.nextLine();

        System.out.println("나이를 입력하시겠습니까? yes or no ");
        String q = sc.nextLine();

        if (q.equalsIgnoreCase("yes")) {
            System.out.print("나이를 입력하세요 : ");
        int inputAge = sc.nextInt();
        sc.nextLine();
         if(inputAge <100  && inputAge >=1) {
             u.setAge(inputAge);
            System.out.println("[ "+ u.getAge() + "]나이를 저장했습니다. ");
         } else {
            System.out.println("나이는 1세 이상 100세 미만만 가능합니다.");
            return;
        } } else if (q.equalsIgnoreCase("no")){
             System.out.println("나이는 추후 개인정보에서 재설정 가능합니다. ");
            } else {
             System.out.println("잘못입력했습니다.");
             return;
            }

        System.out.println(" 이메일을 입력하세요 ");
        String inputEmail = sc.nextLine();
        u.setEmail(inputEmail);
        System.out.println("[ "+ u.getEmail()+ "] 을 저장했습니다.");









    }
    //매개변수 생성자 통해서 저장, 나이는 필수가 아님
    //매개변수 생성자 -> 이름 / 이메일만 필수로 받도록 수정
    // 이메일을 입력하시겠습니까? yes/no 대소문자 구분없이 입력받기
    //yes 했다면 setage통해 입력받은 이메일값 저장 하기

}
