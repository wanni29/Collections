package list.arrayList;
import java.util.ArrayList;

public class Practice_ArrayList {

    public static void main(String[] args) {
        // 데이터가 가변적인것이 특징!
        // 정수를 저장할 수 있는 ArrayList 생성
        ArrayList<Integer> numbers = new ArrayList<>();

        // 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // 요소 접근
        System.out.println("첫 번째 요소 : " + numbers.get(0));
        System.out.println("두 번째 요소 : " + numbers.get(1));
        System.out.println("세 번째 요소 : " + numbers.get(2));

        // 요소 개수 확인
        System.out.println("요소 갯수 : " + numbers.size());

        // 요소 제거 
        numbers.remove(1);
        System.out.println("두 번째 요소 제거 후 : " + numbers);

        // ArrayList 순회
        System.out.println("ArrayList 순회 :");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }

}
