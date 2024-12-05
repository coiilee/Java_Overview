package com.kh.practiceEx.arrayPre;

import java.util.Arrays;

public class ArraysPre {

    public void int1DArray(){
        int[]arr1={10,300,20,50,7000,9999};
        int[]arr2={10,300,20,50,7000,9999};

        //1. Arrays toString을 이용해서 arr1과 arr2출력
        System.out.println("arr1 : "+Arrays.toString(arr1));
        System.out.println("arr2 : "+Arrays.toString(arr2));

        //2. arr1 오름차순 정렬
        Arrays.sort(arr1);
        System.out.println("오름차순으로 정렬한 값 : " + Arrays.toString(arr1));

        //3. arr1 안의 모든 값을 500으로 변경
        Arrays.fill(arr1,500);
        System.out.println("모든 값 500으로 변경한 값 : " + Arrays.toString(arr1));

        //4. arr1과 arr2의 값이 모두 같은지 비교하고 비교한 결과 출력
        System.out.println("arr1과 arr2의 값 같은지 비교 : "+Arrays.equals(arr1,arr2));

    }
    public void String1DArray(){
        String[] arr1={"apple","banana","grape","orange","pineapple"};
        String[] arr2={"apple","banana","grape","orange","pineapple"};

        //1
        //2
        //3
        //4

    }


    public static void main(String[] args) {
        ArraysPre arrayPre = new ArraysPre();
        arrayPre.int1DArray();
    }
}
