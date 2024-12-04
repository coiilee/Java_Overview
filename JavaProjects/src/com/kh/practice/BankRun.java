package com.kh.practice;

public class BankRun {
    public static void main(String[] args) {
                                                        //계좌번호          //현재잔액
        BankAccount account = new BankAccount("123-456",1000);
        account.deposit(100);
        account.withdraw(200);
        account.withdraw(150000);
    }
}
