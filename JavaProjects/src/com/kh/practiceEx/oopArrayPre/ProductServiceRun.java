package com.kh.practiceEx.oopArrayPre;

import java.util.Scanner;

public class ProductServiceRun {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
       String inputDesc = null;
        String inputCat = null;
        //제품명 가격 입력받기
        //제품설명과 카테고리는 입력유무 물어본 후 yes로 입력하면
        //제품설명과 카테고리 작성 후 저장
        //no 입력하면 제품명과 가격만 저장
      /*  //p1 제품 추가
        Product p1 = new Product(100000,"스마트폰");
        p1.setDescription("최신 스마트폰입니다. 12/24 출고예정");
        p1.setCategory("전자기기");

        //p2 제품 추가
        Product p2 = new Product(150000,"노트북");
        //p2에서 제품설명이 null 값일 경우 없음으로 저장
        if(p2.getDescription() == null){ //get에서 저장된 값이 없을 경우 null
            p2.setDescription("없음");
        }
        //p2에서 카테고리가 null 값일 경우 없음으로 저장
        if(p2.getCategory() == null){
            p2.setCategory("없음");
        }
        productService.addProduct(p1);
        productService.addProduct(p2);
  */
        
        System.out.println("제품명 입력하세요");
        String inputName = sc.nextLine();
        System.out.println("가격을 입력하세요"); 
        int inputPrice = sc.nextInt();
        sc.nextLine();
        
        System.out.println("제품설명과 카테고리를 입력하시겠습니까? yes or no");
        String inputQ = sc.nextLine();
        if (inputQ.equals("yes")) {
            System.out.println("제품설명을 입력하세요");
             inputDesc = sc.nextLine();
           p.setDescription(inputDesc);
           System.out.println("카테고리를 입력하세요");
            inputCat = sc.nextLine();
           p.setCategory(inputCat); //if문 밖에 써야하는지 ?
           System.out.println("카테고리를 저장했습니다." + inputCat);
        } else if (inputQ.equals("no")) {
            System.out.println("설명 및 카테고리는 추후 재 저장 가능합니다.");
             inputDesc = "제품 설명이 존재하지 않습니다";
             inputCat = "카테고리 없음";

        } else {
            System.out.println("잘못 입력했습니다. 다시 작성해주세요");
        }


        productService.addProduct(p);
        p.setDescription(inputDesc);
        p.setDescription(inputCat);

                
        //제품 목록 보기
        productService.viewProducts();


        //제품명으로 제품검색
        //searchProduct 기능이 void 가 아닌 return 값이 product 이기 때문에 Product 자료형으로 변수명 설정
       Product sp =  productService.searchProduct("노트북");
       if( sp != null){
           System.out.println("검색된 제품 : "+sp);
       } else {
           System.out.println("해당 이름에 제품을 찾을 수 없습니다.");
       }

    }
}
