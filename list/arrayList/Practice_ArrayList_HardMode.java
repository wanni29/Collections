package list.arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Practice_ArrayList_HardMode {

    public static void main(String[] args) {
        // 문자열을 저장 할 수 있는 ArrayList 생성
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");
        words.add("Fig");

        // ArrayList에서 길이가 5이상인 단어들만 선택하여 새로운 리스트 생성
        List<String> longWords = words.stream()
        .filter(word -> word.length() >= 5)
        .collect(Collectors.toList());

        System.out.println("길이가 5이상인 단어들 : " + longWords);

        // 길이가 5이상인 단어들을 연결하여 하나의 문자열 생성
        String concatenatedWords = words.stream()
        .filter(word -> word.length() >= 5)
        .collect(Collectors.joining(", "));

        System.out.println("길이가 5 이상인 단어들 연결 : " + concatenatedWords);
    }

}
