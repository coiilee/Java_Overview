package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class GoodsService {

    //상품들을 담을 목록 리스트 
    private ArrayList<Goods> goodsList = new ArrayList<>();

    /** void addGoods(Goods goods) 상품 추가 기능 (Goods에 존재하는 번호 이름 수량 가격 추가)
     *
     * @param goods (Goods에 존재하는 번호 이름 수량 가격 추가)
     */
    //상품 추가 기능 
    public void addGoods(Goods goods) {
        goodsList.add(goods);
        System.out.println(goods.getName() + "상품이 추가되었습니다.");
    }

    /** Goods getGoodsById(int id) 상품전달 상품번호로 상품 가져오기 기능 (상품번호)
     *
     * @param id 상품 번호
     * @return 상품 번호에 해당하는 Goods 상품을 사용자에게 전달하는 것 Goods = 번호,이름,수량,가격 포함되어 있음
     */
    //상품 번호로 원하는 상품 가져오기 기능 
    public Goods /*return 자료형*/ getGoodsById(int id) {
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                return goods;
            }
        }
        System.out.println("상품 "+id+"번에 해당하는 상품을 찾을 수 없습니다.");
        return null; //상품번호로 해당하는 상품이 없을 경우 빈 값 전달하기.
    }

    /** getGoodsByName(String name) 상품명으로 상품 조회
     *
     * @param name 상품 이름 값을 받아서 조회
     * @return goods로 상품이름에 해당하는 상품이 존재하면 전달
     */
    public Goods  getGoodsByName(String name) {
        for (Goods goods : goodsList) {
            if (goods.getName().equalsIgnoreCase(name)) { // ignorecase 사용 -> 대소문자 구분 없이 검색
                return goods;
            }
        }
        return null;
    }

    /** void displayAllGoods (매개변수 없음) 모든 상품 보기 기능
     *  매개변수 없음
     *  상품을 조회했을 때 상품 리스트가 존재하지 않는다면 , 상품 없음 출력하기
     *  상품 존재 유무는 isEmpty() 기능을 활용해서 목록이 비어있는지 안비어있는지 확인 후 출력
     */
    //모든 상품 보기 기능
    public void displayAllGoods() {

        if (goodsList.isEmpty()) {
            System.out.println("상품 리스트가 존재하지 않음");
        } else {
            System.out.println("========상품 리스트========");
            for (Goods goods : goodsList) {
                System.out.println(goods);
            }
        }

    }
    
    //상품 삭제하기 기능

    /**
     * void removeGoodsById (int id) 상품 삭제하기 기능(상품번호)
     * @param id 상품번호로 조회된 상품 삭제
     */
    public void removeGoods(int id) {
        //만약 제거할 상품번호가 존재하지 않는다면! Goods toGoods = null;
        Goods toGoods = null;
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                toGoods = goods;
                goodsList.remove(goods);
                break;
            }
            if (toGoods == null ) {
                System.out.println("상품번호"+id+"로 조회된 상품이 존재하지 않아 삭제 불가합니다.");
            } else {
                System.out.println("상품번호 "+id+"에 해당하는 상품을 제거했습니다.");
            }
        }

    }
}





















