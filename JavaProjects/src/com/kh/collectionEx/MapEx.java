package com.kh.collectionEx;

import java.util.HashMap;
import java.util.Map;

import static java.time.chrono.JapaneseEra.values;

public class MapEx {
/*
* Entry<Key,Value>
* 키-값 쌍으로 데이터를 저장하는 구조
* 키는 중복을 허용하지 않지만 값은 중복을 허용함
* 키 = Key 값 = Value
* 대표적인 클래스 : HashMap, LinkedHashMap, TreeMap
*
* 특징
* 키는 중복 허용하지 않음 : 동일한 키로 여러번 데이터를 저장하면,
*                       기존의 값이 새로운 값으로 덮어씌워짐
* 값은 중복을 허용      : 동일한 값은 다른 키에 여러번 저장될 수 있음
* 순서                : HashMap은 순서를 보장하지 않지만
*                      LinkedHashMap은 입력 순서를 유지
*                      TreeMap   키의 자연 순서 or 지정된 순서로 정렬
*
* 메서드
* put(K key , V value)         : 지정한 키에 해당하는 값을 저장
* get(Object key)              : 지정한 키에 해당하는 값을 반환
* remove(Object key)           : 지정한 키에 해당하는 요소(=값) 삭제
* containsKey(Object key)      : 지정한 키가 존재하는지 확인
* containsValue(Object value)  : 지정한 값이 존재하는지 확인
* size()                       : Map에 저장된 요소(=값)의 개수를 반환
* clear()                      : 모든 요소(=값) 삭제
* keySet()                     : 저장된 모든 키를 Set으로 반환
* values()                     : 저장된 모든 값을 Collection으로 반환
* entrySet()                   : 저장된 모든 엔트리(키-쌍)을 set으로 반환
*
* 사용법
* Map<String, String>변수이름 = new HashMap<String,String>();
* HashMap<String, String>변수이름 = new HashMap<String,String>();
*
* 키가 숫자이고, 값이 String일 때
* HashMap<Integer, String>변수이름 = new HashMap<Integer,String>();
*
* 키가 String이고 값이 int일 때
* HashMap<String, Integer>변수이름 = new HashMap<String, Integer>();
*
* */

    public static void main(String[] args) {
        //HashMap 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        //1. 사과 1000 바나나 2000 포도 3000 추가
        map.put("사과",1000);
        map.put("바나나",2000);
        map.put("포도",3000);
        System.out.println(map);
        //2. 사과가 얼마인지 System 출력문 이용해 확인
        System.out.println("사과의 가격 : " + map.get("사과")+ "원");

        //3. 물가가오름. 사과를 1500으로 변경
        map.put("사과",1500);
        System.out.println("사과 가격이 올랐습니다"+map.get("사과")+"원");

        //4. 바나나 판매합니까? system출력문 이용해 yes no 확인
        System.out.println("바나나 판매 합니까?");
        if(map.containsKey("바나나")) {
            System.out.println("yes");
        } else { System.out.println("no"); }
        //아래는 삼항연산자로 활용.                               true   false
        // boolean hasBanana = (map.containsKey("바나나")) ?  "YES" : "NO" ;


        //5. 3000짜리 과일이 존재하는지 system출력문으로 확인
        // System.out.print(map.containsValue(3000));
        String has3000value = map.containsValue(3000) ? "yes" : "no";
        System.out.println("3000원짜리 과일 ? " + has3000value);

        //6. 바나나가 품절됨. 바나나 데이터 삭제
        map.remove("바나나");
        System.out.println(map);
        //7. 과일의 개수는 ?
        System.out.println(map.size());

        //8. 모든 키 출력
        //System.out.println 안쓰면 내용에 실행되지 않어!!!!!!
        map.keySet();
        System.out.println("모든 키 : "+map.keySet());
        //9. 모든 값 출력
        map.values();
        System.out.println("모든 값 : "+map.values());
        //10. 모든 키, 값 출력
        map.entrySet();
        System.out.println("모든 키ㅡ값 : "+map.entrySet());
    }

}
