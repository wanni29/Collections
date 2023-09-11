package map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice_LinkedHashMap_VeryHardMode {

    public static void main(String[] args) {

        // LinkedHashMap 개념
        // 삽입순서 유지
        // 중복 허용안함
        
        // LinkedHashMap 생성
        LinkedHashMap <Integer, String> linkedHashMap = new LinkedHashMap<>();

        // 값 추가
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");

        // LinedHashMap을 Stream 으로 변환
        Stream<Map.Entry<Integer, String>> entryStream = linkedHashMap.entrySet().stream();
        System.out.println(entryStream);


        // 조건에 따라 요소 필터링
        Stream<Map.Entry<Integer, String>> filteredStream = entryStream.filter(entry -> entry.getKey() % 2 == 0);
        System.out.println(filteredStream);

        // 키 값을 기준으로 정렬
        Stream<Map.Entry<Integer, String>> sortedStream = filteredStream.sorted(Map.Entry.comparingByKey());
        System.out.println(sortedStream);

        // 값 매핑
        Stream<String> valueStream = sortedStream.map(Map.Entry::getValue);
        System.out.println(valueStream);

        // 결과를 리스트로 수집
        List<String> resultList = valueStream.collect(Collectors.toList());
        System.out.println(resultList);

        System.out.println("Filtered and sorted values : " + resultList);
    }

}
