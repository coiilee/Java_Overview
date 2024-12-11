package com.kh.practiceEx.oopArrayPre;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();
        Scanner scanner = new Scanner(System.in);
        //false가 될 때까지 반복
        while (true) {
            System.out.println("\n=====상품 설정 시스템=====");
            System.out.println("1. 상품 추가하기");
            System.out.println("2. 모든 상품 보기");
            System.out.println("3. 원하는 상품 보기(상품 번호로 조회)");
            System.out.println("4. 상품 제거하기(상품 번호로 제거)");
            System.out.println("5. 종료하기");
            System.out.print("번호를 선택하세요.");


            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); //줄바꿈 버퍼 제거
                switch (choice) {
                    case 1:
                        System.out.println("상품 번호 입력");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("추가할 상품 입력");
                        String name = scanner.nextLine();
                        System.out.println("상품 가격 입력");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("상품 수량 입력");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
                        goodsService.addGoods(new Goods(id,name,price,quantity));
                        System.out.println("상품이 추가되었습니다.");
                        break;
                        case 2:
                            System.out.println("=======모든 상품 조회하기======");
                            goodsService.displayAllGoods();
                            break;
                    case 3:
                                System.out.println("======상품 찾기 서비스 ========");
                                System.out.println("찾을 상품의 번호를 입력하세요");
                                int viewNum = scanner.nextInt(); //작성 못한 부분,강사님 수정받음
                                scanner.nextLine();
                               goodsService.getGoodsById(viewNum);//작성 못한 부분,강사님 수정받음
                        Goods goods = goodsService.getGoodsById(viewNum);
                                System.out.println(goods);
                                break;
                    case 4 :
                        System.out.println("====상품 이름으로 찾기 =====");
                        System.out.println("검색할 상품의 이름을 입력하세요");
                        String searchName = scanner.nextLine();
                        scanner.nextLine();
                        goodsService.getGoodsByName(searchName);
                        break;
                    case 5:
                                    System.out.println("======상품 제거 서비스 ========");
                                    System.out.println("삭제할 상품번호를 입력하세요");
                                    int removeNum = scanner.nextInt(); //작성 못한 부분,강사님 수정받음
                                    scanner.nextLine();
                                    goodsService.removeGoods(removeNum);
                                    break;

                                    case 6:
                                        System.out.println("======시스템 종료를 선택하셨습니다. ======");
                                        return;

                                        default:
                                            System.out.println("======잘못 입력했습니다. 숫자만 입력 가능합니다/======");
                                            break;
                }

            } catch(InputMismatchException e){ //숫자칸에 문자를 넣었을 때 보여줄 출력문
                System.out.println("숫자형식만 가능합니다"+e.getMessage());
            }
            catch (Exception e) {
                System.out.println("문제가 발생했습니다"+e.getMessage());
//            } finally {
//                System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}
