package set.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Hidden_NavigableSet {

    public static void main(String[] args) {
        // TreeSet 생성
        NavigableSet<Integer> treeSet = new TreeSet<>();

        // 요소 추가 
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // 더 작은 값들 중 최대 값 가져오기 (10 이하의 값 중 최대 값)
        int lowerMax = treeSet.lower(11);
        System.out.println("10 이하의 값 중 최대 값 : " + lowerMax); // 출력 결과 10

        // 더 큰 값들 중 최소값 가져오기 (20 이상의 값 최소 값)
        int higherMin = treeSet.higher(19);
        System.out.println("20 이상의 값 중 최소 값 : " + higherMin); // 출력 결과 20

        // 범위 기반 조회 (20 이상이고 40 미만의 값들) ???
        NavigableSet<Integer> subSet = treeSet.subSet(20, false, 40, false);
        System.out.println("20 이상이고 40 미만인 값들 : " + subSet);
    }

}
