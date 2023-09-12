package map.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Pratice_HashTable_HardMode {

    public static void main(String[] args) {
        // Hashtable 생성
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // 값을 삽입
        hashtable.put("apple", 5);
        hashtable.put("banana", 10);
        hashtable.put("cherry", 15);

        // Hashtable을 스트림으로 변환하고 조작
        Map<String, Integer> filteredMap = hashtable.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 8)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // 결과 출력
        System.out.println("Filtered Hashtable : ");
        filteredMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
