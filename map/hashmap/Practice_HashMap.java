package map.hashmap;

import java.util.HashMap;

public class Practice_HashMap {
    public static void main(String[] args) {

        // hashMap 키와 밸류 
        // 중복 허용 안함
        // 순서없음

        // HashMap 생성
        HashMap<String, Integer> hashMap = new HashMap<>();

        // key-value 쌍 추가
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);

        // key를 사용하여 value 에 액세스
        int age = hashMap.get("Bob");
        System.out.println("Bob의 나이 : " + age);

        // Key가 존재하는지 확인
        boolean containsKey = hashMap.containsKey("Dave");
        System.out.println("Dave 키가 존재하는가 : " + containsKey);
    }

}
