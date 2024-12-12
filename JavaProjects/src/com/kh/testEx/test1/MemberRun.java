package com.kh.testEx.test1;
//set 생성자로 아이디 이름 비번 넣기 
//user1 갈길자 pass1 
//user1 pass1 로그인 성공할 경우 로그인 성공 ! 강질자님 환영합니다. 
//                    실패할 경우 로그인 실패 ! 아이디 또는 비밀번호는 확인하세요 

import java.util.Scanner;

public class MemberRun {
    public static void main(String[] args) {

        Member member = new Member();
        member.setId("user1");
        member.setName("이다경");
        member.setPassword("123456");
        System.out.println(member);

        if(member.login("user1", "123456")) {
            System.out.println(member.getId()+"로그인성공");
        } else {
            System.out.println("잘못된 아이디, 비밀번호입니다.");
        }



    }
    
}
