package com.kh.practiceEx.oopArrayPre;

public class Product {
    private String name;
    private int price;
    private String description;
    private String category;

    //메서드 기본생성자 파라미터생성사 게터 세터 toString
    //파라미터 생성자는 name price 만 설정

    public Product() {
    }

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }
//setter의 경우 저장
    //상품 설명과 카테고리는 선택사항으로 저장유무 결정 가능
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //getter의 경우 매개변수 생성자(파라미터생성자) 나
    // setter로 가져온 정보 반환
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return  "제품명='" + name + '\'' +", \n제품가격=" + price + ", \n제품설명='" + description + '\'' + ", \n카테고리='" + category + '\'' +'}';
    }
}
