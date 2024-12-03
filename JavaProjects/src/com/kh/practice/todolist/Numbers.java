package com.kh.practice.todolist;

public class Numbers {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        int sum2 = 0;
        for ( int i : numbers ) {
            if(i%2 != 0 ) {
                sum2 += i;
            }
        }
        System.out.println(sum2);
    }
}
