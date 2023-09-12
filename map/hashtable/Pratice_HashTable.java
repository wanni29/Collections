package map.hashtable;

import java.util.Hashtable;

public class Pratice_HashTable {

    public static void main(String[] args) {

        // hashtable 개념
        // 키값 저장
        // 순서 보장
        // null 값 허용안함
        // 크기를 동적으로 조절가능

        // Hashtable 생성
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        //  값을 삽입
        hashtable.put("apple", 5);
        hashtable.put("banana", 10);

        // 값을 검색
        int appleValue = hashtable.get("apple");
        int bananaValue = hashtable.get("banana");

        System.out.println("apple : " + appleValue); // 출력 : apple : 5
        System.out.println("banana : " + bananaValue); // 출력 : banana : 10

    }

}
