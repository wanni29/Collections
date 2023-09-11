package map.treemap;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice_TreeMap {

    public static void main(String[] args) {
        // 정렬된 순서
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 값 추가
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        // TreeMap을 Stream으로 변환
        Stream<Map.Entry<Integer, String>> entryStream = treeMap.entrySet().stream();

        // 조건에 따라 요소 필터링
        Stream<Map.Entry<Integer, String>> filterStream = entryStream.filter(entry -> entry.getKey() % 2 == 0);

        // 키 값을 기준으로 정렬
        Stream<Map.Entry<Integer, String>> sortedStream = filterStream.sorted(Map.Entry.comparingByKey());

        // 값 매핑
        Stream<String> valueStream = sortedStream.map(Map.Entry::getValue);

        // 결과를 리스트로 수집
        List<String> resultList = valueStream.collect(Collectors.toList());

        // 결과 출력
        System.out.println("Filtered and sored values: "  + resultList);

        // 와 이게 뭔말이지..... 이건어렵다.



    }

}
