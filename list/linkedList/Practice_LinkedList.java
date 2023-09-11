package list.linkedList;

import java.util.LinkedList;

public class Practice_LinkedList {

    public static void main(String[] args) {
        // 값을 처리하는 속도가 상당히 빠른것이 특징!
        // LinkedList 생성
        LinkedList<String> linkedList = new LinkedList<>();

        // 요소 추가
        linkedList.add("apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // 요소 삽입
        linkedList.add(1, "Grapes");

        // 요소 순회
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 요소 삭제
        linkedList.remove("Banana");

        // LinkedList 크기 확인
        System.out.println("LinkedList 크기 : " + linkedList.size());

    }

}
