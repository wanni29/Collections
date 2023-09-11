package set.linedhashset;

import java.util.LinkedHashSet;

public class Practice_LinkedHashSet {

    public static void main(String[] args) {

        //LinkedHashSet
        // 중복을 허용치 않으며, 입력 된 순서를 유지
     
        // LinkedHashSet 생성
        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>();

        // 요소 추가
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        // 순서를 유지한 상태로 요소 출력
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // 중복된 요소 추가 시도 (이미 존재하므로 추가되지 않음)
        linkedHashSet.add("Apple");

        // 요소 갯수 확인
        System.out.println("요소 갯수 : " + linkedHashSet.size());

    }

}
