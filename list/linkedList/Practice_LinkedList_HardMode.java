package list.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Practice_LinkedList_HardMode {
    public static void main(String[] args) {
        // 문자열을 저장할 수 있는 LinkedList 생성
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Fig");

        // 길이가 5 이상인 단어들만 선택하여 새로운 리스트 생성
        List<String> longWords = linkedList.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());

        // filter 와 map 의 차이는 ? 
        // filter 는 스트림을 달은 리스트의 원소 하나하나가 조건을 만족하면 사용한다.
        // map 은 스트림을 달은 리스트의 원소 모두를 이용하여 새로운 리스트 값을 만든다.
        System.out.println("길이가 5 이상인 단어들 : " + longWords);

        String concatenatedWords = linkedList.stream()
        .filter(word -> word.length() >= 5)
        .collect(Collectors.joining(", "));

        System.out.println("길이가 5 이상인 단어들 연결 : " + concatenatedWords);
    }

}
