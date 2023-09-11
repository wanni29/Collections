package set.hashset;

import java.util.HashSet;

public class Practice_HashSet {

    public static void main(String[] args) {
        // HashSet
        // 중복을 허용치 않는다.
        // 순서를 보장하지 않는다. 

        // HashSet 생성
        HashSet<String> hashSet = new HashSet<>();

        // 요소 추가
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // 중복된 요소 추가 시도
        hashSet.add("Apple"); // 이미 존재하므로 추가 되지 않음

        // 요소 순회
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // 요소 갯수 확인
        System.out.println("요소 갯수 : " + hashSet.size());

    }

}
