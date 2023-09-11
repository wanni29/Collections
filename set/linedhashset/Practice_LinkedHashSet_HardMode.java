package set.linedhashset;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Practice_LinkedHashSet_HardMode {

    public static void main(String[] args) {

        //LinkedHashSet
        // 중복을 허용치 않으며, 입력 된 순서를 유지
     
        // LinkedHashSet 생성
        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>();

        // 요소 추가
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");
        linkedHashSet.add("Fig");

        // 문자열 길이가 5 이상인 요소들만 선택하여 새로운 LinkedHashSet 생성
        LinkedHashSet<String> longWords = linkedHashSet.stream()
        .filter(word -> word.length() >= 5)
        .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("길이가 5이상인 단어들 : " + longWords);

    }

}
