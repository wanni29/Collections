package map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice_HashMap_HardMode {

    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, Integer> hashMap = new HashMap<>();

        // key-value 쌍 추가
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);
        hashMap.put("David", 35);
        hashMap.put("Eve", 32);

        // 나이가 30 이상인 사람들의 이름 필터링
        Map<String, Integer> result = hashMap.entrySet()
        .stream()
        .filter(entry -> entry.getValue() >= 30)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        // 이거 쓰면 내가 막힌 코딩 테스트 문 다시 열수 있음
        Set<String> names = result.keySet();
        Collection<Integer> values = result.values();

        System.out.println("나이가 30 이상인 사람들의 이름 : " + result.keySet());


    }

}
