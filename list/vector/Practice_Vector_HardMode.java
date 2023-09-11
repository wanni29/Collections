package list.vector;

import java.util.Collection;
import java.util.Vector;
import java.util.stream.Collectors;

public class Practice_Vector_HardMode {

    public static void main(String[] args) {
        // 문자열을 저장할 수 있는 Vector 생성
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Fig");

        // 길이가 5 이상인 단어들만 선택하여 새로운 Vector 생성
        Vector<String> longWords = vector.stream()
        .filter(word -> word.length() >= 5)
        .collect(Collectors.toCollection(Vector::new));

        System.out.println("길이가 5 이상인 단어들 : " + longWords);


    }

}
