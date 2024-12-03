package com.kh.collectionEx;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

    /*
    * 중복을 허용하지 않는 컬렉션
    * 순서가 없다는 특징이 있으며 , 중복된 데이터를 제거하거나, 고유한 값만 관리할 때 사용함
    * 대표적인 클래스 : HashSet(빠른 검색과 삽입), LinkedHashSet(순서유지가 돼서 느림) , TreeSet(
    *
    * 특징
    * 중복된 값 저장 불가 : 동일한 요소(값)을 두번 추가하려고 해도 한 번만 저장됨
    * 순서가 없음        : 저장된 요소들의 순서는 보장되지 않음
    * null 허용         : null을 하나만 허용 ( 왜냐하면 null 이 두가지 이면 중복이기 때문. )
    *
    * 메서드
    * add(E e)            : 요소(=값) 추가 / 이미 존재하는 요소를 추가하려하면 false를 반환
    * remove(Object o)    : 특정 요소를 제거
    * contains(Object o)  : 특정 요소가 존재하는지 확인
    * size()              : 저장된 요소의 개수를 반환
    * clear()             : 모든 요소 제거
    *
    * 사용법
    *       Set<>변수이름 = new HashSet<>();
    *       new HashSet<>(); = Set<>변수이름;
    *
    * 나머지는 List 와 동일
    * */

    public static void main(String[] args) {
        Set<String>s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();
    }
}

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