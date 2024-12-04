package com.kh.practice;

public class BankAccount {
    //계좌 , 비밀번호,
    //필드=속성=전역변수=멤버변수=인스턴트변수
    private String accountNumber;
    private double balance;
    //기본생성자
    public BankAccount() {
    }
    //필수생성자
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * deposit 입금 기능
     * @param amount 입금할 금액
     */
    //입금
    public void deposit(double amount) {
        if (amount > 0) { //입금할 금액이 0원보다 클 경우에만 입금 가능하게 하기
            balance += amount; //현재잔액에 입금 금액 더하기 해주는것
            System.out.println(amount + "원이 입금되었습니다. 현재잔액 : "+balance + "원");
        }else {
            System.out.println("insufficient funds");
        }
    }
    //출금

    /**
     * withdraw 출금 기능
     * @param amount
     */
    public void withdraw(double amount) {
        if (amount > balance) { //출금할 금액이 balance 잔액보다 크기 때문에
            System.out.println("잔액부족. 출금 불가");
        } else {
            balance -= amount; //현재 잔액에서 출금 금액을 빼기 해준 것
            System.out.println(amount+"원이 출금되었습니다. 남은 잔액 : "+balance+"원");
        }
    }

}













