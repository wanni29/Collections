package set.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice_HashSet_HardMode {

    public static void main(String[] args) {
        // 문자열을 저장 할 수 있는 HashSet 생성
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // 중복된 요소

        // HashSet의 각 요소를 소문자로 변호나하고 중복 제거하여 새로운 HashSet을 생성
        Set<String> lowercaseSet = hashSet.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        // .collect(Collectors.toSet()); <- Set<String> 처음에 선언한 타입이 set 이면
        // collcectors.to타입 선언한 타입임!

        System.out.println(lowercaseSet);
    }

}
