package set.treeset;

import java.util.TreeSet;

public class Practice_TreeSet {

    public static void main(String[] args) {
        // SortedSet!
        // 정렬된 순서, 중복된 요소를 가지지 않음
        // red-black 트리 데이터 구조 ???

        // TreeSet 생성
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 요소 추가
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);

        // 정렬된 순서로 요소 출력 
        for (Integer num : treeSet) {
            System.out.println(num);
        }

        // 중복된 요소 추가 시도(이미 존재하므로 추가되지 않음)
        treeSet.add(30);

        // 요소 갯수 확인
        System.out.println("요소 갯수 : " + treeSet.size());

    }

}
