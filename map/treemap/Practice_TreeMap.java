package map.treemap;

import java.util.TreeMap;

public class Practice_TreeMap {

    public static void main(String[] args) {
        // 정렬된 순서
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 값 추가
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        // 값 조회
        String value = treeMap.get(2);
        System.out.println("Key 2에 대한 값 : " + value);

        // 키 순회
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key : " + key + ", Value: " + treeMap.get(key));
        }




    }

}
