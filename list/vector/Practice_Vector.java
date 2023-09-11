package list.vector;

import java.util.Vector;

public class Practice_Vector {

    public static void main(String[] args) {
        // 여러 스레드가 동시에 접근할 때 안전하게 요소를 추가하고 삭제할 수 있도록 설계
        // 스레드 안전성을 제공하는 점이 다름

        // Vector 생성
        Vector<String> vector = new Vector<>();

        // 요소 추가
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // 요소 접근
        System.out.println("첫 번째 요소 : " + vector.get(0));
        System.out.println("두 번째 요소 : " + vector.get(1));
        System.out.println("세 번째 요소 : " + vector.get(2));

        // 요소 갯수 확인
        System.out.println("요소 갯수 : " + vector.size());

        // 요소 제거
        vector.remove(1);
        System.out.println("두번째 요소 제거 후 : " + vector);


    }


}
